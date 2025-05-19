package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

    private final DoacaoService doacaoService;

    @Autowired
    public DoacaoController(DoacaoService doacaoService) {
        this.doacaoService = doacaoService;
    }

    @GetMapping("/total-por-parceiro")
    public List<TotalPorParceiroDTO> getTotalPorParceiro(
            @RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate inicio,
            @RequestParam("fim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fim,
            @RequestParam(value = "idParceiro", required = false) Long idParceiro) {
        return doacaoService.getTotalPorParceiro(inicio, fim, idParceiro);
    }

//    @GetMapping("/relatorio/comparativo")
//    public ComparativoDTO getComparativo(
//            @RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date inicio,
//            @RequestParam("fim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fim) {
//        return doacaoService.getComparativo(inicio, fim);
//    }
//
    @GetMapping("/relatorio/arrecadacao-mensal")
    public List<ArrecadacaoMensalDTO> getArrecadacaoMensal(@RequestParam("ano") Integer ano) {
        return doacaoService.getArrecadacaoMensal(ano);
    }
}
