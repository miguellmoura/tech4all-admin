package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech4all_admin.tech4all_admin.doacao.ArrecadacaoMensalDTO;
import com.tech4all_admin.tech4all_admin.doacao.ComparativoDTO;
import com.tech4all_admin.tech4all_admin.doacao.TotalPorParceiroDTO;

import java.sql.Date;
import java.util.List;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    public List<TotalPorParceiroDTO> getTotalPorParceiro(Date inicio, Date fim, Integer idParceiro) {
        return doacaoRepository.findTotalPorParceiro(inicio, fim, idParceiro);
    }

    public ComparativoDTO getComparativo(Date inicio, Date fim) {
        return doacaoRepository.findComparativo(inicio, fim);
    }

    public List<ArrecadacaoMensalDTO> getArrecadacaoMensal(Integer ano) {
        return doacaoRepository.findArrecadacaoMensal(ano);
    }
}
