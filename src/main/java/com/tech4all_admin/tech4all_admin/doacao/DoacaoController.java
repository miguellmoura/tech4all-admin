package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalDate;

@RestController
public class DoacaoController {

    private final DoacaoService doacaoService;
    private final DoacaoRepository doacaoRepository;

    private int mesAtual = LocalDate.now().getMonthValue();

    @Autowired
    public DoacaoController (DoacaoService doacaoService, DoacaoRepository doacaoRepository) {
        this.doacaoService = doacaoService;
        this.doacaoRepository = doacaoRepository;
    }

    @GetMapping("/doacoes")
    public DoacaoDashboardDTO getDoacoes() {
        ArrayList<DoacaoDTO> doacoes = doacaoService.getDoacoes();
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();

        for (DoacaoDTO doacao : doacoes) {
            if (doacao.getDataDoacao() != null) {
                LocalDate localDate = doacao.getDataDoacao().toLocalDate();
                String mesDoacao = localDate
                        .getMonth()
                        .getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
                // Capitaliza a primeira letra (opcional)
                mesDoacao = mesDoacao.substring(0, 1).toUpperCase() + mesDoacao.substring(1);
                labels.add(mesDoacao);
            } else {
                labels.add("Sem data");
            }

            values.add(doacao.getValor());
        }

        return new DoacaoDashboardDTO(labels, values);
    }
}
