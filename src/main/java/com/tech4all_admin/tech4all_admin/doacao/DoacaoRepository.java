package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.tech4all_admin.tech4all_admin.doacao.ArrecadacaoMensalDTO;
import com.tech4all_admin.tech4all_admin.doacao.ComparativoDTO;
import com.tech4all_admin.tech4all_admin.doacao.TotalPorParceiroDTO;

import java.util.List;

public interface DoacaoRepository extends CrudRepository<Doacao, Integer> {

    @Query("SELECT new com.tech4all_admin.tech4all_admin.dto.TotalPorParceiroDTO(p.nome, SUM(d.valor)) " +
           "FROM Doacao d JOIN Parceiro p ON d.id_parceiro = p.id " +
           "WHERE d.data_doacao BETWEEN :inicio AND :fim " +
           "AND (:idParceiro IS NULL OR p.id = :idParceiro) " +
           "GROUP BY p.nome")
    List<TotalPorParceiroDTO> findTotalPorParceiro(@Param("inicio") java.sql.Date inicio,
                                                   @Param("fim") java.sql.Date fim,
                                                   @Param("idParceiro") Integer idParceiro);

    @Query("SELECT new com.tech4all_admin.tech4all_admin.dto.ComparativoDTO(\n" +
           "    SUM(CASE WHEN d.id_parceiro IS NOT NULL THEN d.valor ELSE 0 END),\n" +
           "    SUM(CASE WHEN d.id_parceiro IS NULL THEN d.valor ELSE 0 END))\n" +
           "FROM Doacao d WHERE d.data_doacao BETWEEN :inicio AND :fim")
    ComparativoDTO findComparativo(@Param("inicio") java.sql.Date inicio,
                                   @Param("fim") java.sql.Date fim);

    @Query("SELECT new com.tech4all_admin.tech4all_admin.dto.ArrecadacaoMensalDTO(\n" +
           "    MONTH(d.data_doacao), SUM(d.valor))\n" +
           "FROM Doacao d WHERE YEAR(d.data_doacao) = :ano GROUP BY MONTH(d.data_doacao)")
    List<ArrecadacaoMensalDTO> findArrecadacaoMensal(@Param("ano") Integer ano);
}