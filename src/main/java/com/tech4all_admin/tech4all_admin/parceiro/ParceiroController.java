package com.tech4all_admin.tech4all_admin.parceiro;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/parceiro")
    public List<Parceiro> getParceiros(){
        return parceiroService.getParceiros();
    }

    @DeleteMapping("/parceiro")
    public ResponseEntity<String> deleteParceiro(@RequestParam("idParceiro") Long idParceiro) {
        try {
            parceiroService.deleteParceiro(idParceiro);
            return ResponseEntity.ok().body("deletado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao excluir parceiro.");
        }
    }

    @PutMapping("/parceiro/{id}")
    public ResponseEntity<Map<String, String>> atualizarParceiro(
            @PathVariable Long id,
            @RequestBody Parceiro parceiroAtualizado) {
        try {
            parceiroService.atualizarParceiro(id, parceiroAtualizado);
            return ResponseEntity.ok(Map.of("mensagem", "Parceiro atualizado com sucesso"));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("erro", "Parceiro não encontrado"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("erro", "Erro ao atualizar parceiro"));
        }
    }



}
