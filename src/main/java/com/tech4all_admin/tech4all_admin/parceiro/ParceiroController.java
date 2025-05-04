package com.tech4all_admin.tech4all_admin.parceiro;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParceiroController {

    private final ParceiroService parceiroService;

    @Autowired
    public ParceiroController(ParceiroService parceiroService) {
        this.parceiroService = parceiroService;
    }

    @PostMapping("/parceiro")
    public ResponseEntity<String> createParceiro(@Valid @RequestBody ParceiroDTO parceiroDTO) {
        parceiroService.createParceiro(parceiroDTO);
        return ResponseEntity.ok("Parceiro criado com sucesso");
    }

}
