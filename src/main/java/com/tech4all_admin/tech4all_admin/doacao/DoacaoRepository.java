package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

@Repository
public interface DoacaoRepository extends JpaRepository <Doacao, Long> {

    @Query("SELECT d FROM Doacao d WHERE MONTH(d.data_doacao) = :mes")
    ArrayList<Doacao> findByMonth(int mes);
}
