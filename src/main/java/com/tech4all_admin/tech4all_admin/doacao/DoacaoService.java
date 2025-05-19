package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoacaoService {

    private final DoacaoRepository doacaoRepository;

    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public List<TotalPorParceiroDTO> getTotalPorParceiro(LocalDate inicio, LocalDate fim, Long idParceiro) {
        return doacaoRepository.findTotalPorParceiro(inicio, fim, idParceiro);
    }

//    public ComparativoDTO getComparativo(Date inicio, Date fim) {
//        return doacaoRepository.findComparativo(inicio, fim);
//    }
//
//    public List<ArrecadacaoMensalDTO> getArrecadacaoMensal(Integer ano) {
//        return doacaoRepository.findArrecadacaoMensal(ano);
//    }
}
