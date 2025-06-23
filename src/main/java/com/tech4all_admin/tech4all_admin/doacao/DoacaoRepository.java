package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.tech4all_admin.tech4all_admin.doacao.ArrecadacaoMensalDTO;
import com.tech4all_admin.tech4all_admin.doacao.ComparativoDTO;
import com.tech4all_admin.tech4all_admin.doacao.TotalPorParceiroDTO;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {

    @Query("SELECT new com.tech4all_admin.tech4all_admin.doacao.TotalPorParceiroDTO(p.id, p.nome, SUM(d.valor)) " +
            "FROM Doacao d " +
            "JOIN d.parceiro p " +
            "WHERE d.data_doacao BETWEEN :inicio AND :fim " +
            "AND (:idParceiro IS NULL OR p.id = :idParceiro) " +
            "GROUP BY p.id, p.nome")
    List<TotalPorParceiroDTO> findTotalPorParceiro(@Param("inicio") LocalDate inicio,
                                                   @Param("fim") LocalDate fim,
                                                   @Param("idParceiro") Integer idParceiro);



    @Query("SELECT new com.tech4all_admin.tech4all_admin.doacao.ComparativoDTO( " +
            "SUM(CASE WHEN d.parceiro IS NOT NULL THEN d.valor ELSE 0 END) , " +
            "SUM(CASE WHEN d.parceiro IS NULL THEN d.valor ELSE 0 END) ) " +
            "FROM Doacao d WHERE d.data_doacao BETWEEN :inicio AND :fim")
    ComparativoDTO findComparativo(@Param("inicio") LocalDate inicio,
                                   @Param("fim") LocalDate fim);

    @Query(
        value = "SELECT MONTH(data_doacao) AS mes, SUM(valor) AS total " +
                "FROM doacao " +
                "WHERE YEAR(data_doacao) = :ano " +
                "GROUP BY MONTH(data_doacao) " +
                "ORDER BY mes",
        nativeQuery = true
)
List<Object[]> findArrecadacaoMensalNativa(@Param("ano") Integer ano);
}
