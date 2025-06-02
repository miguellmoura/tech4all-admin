package com.tech4all_admin.tech4all_admin.parceiro;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParceiroService {

    private final ParceiroRepository parceiroRepository;

    @Autowired
    public ParceiroService(ParceiroRepository parceiroRepository) {
        this.parceiroRepository = parceiroRepository;
    }


    public void createParceiro(ParceiroDTO parceiroDTO) {
        Parceiro parceiro = new Parceiro();
        parceiro.setNome(parceiroDTO.getName());
        parceiro.setTipo(parceiroDTO.getTipo());
        parceiroRepository.save(parceiro);
    }

    public List<Parceiro> getParceiros () {
        return parceiroRepository.findAll();
    }

    public void deleteParceiro (Long idParceiro) {
        parceiroRepository.deleteById(idParceiro.intValue());
    }

    public void atualizarParceiro(Long id, Parceiro parceiroAtualizado) {
        Optional<Parceiro> parceiroExistenteOpt = parceiroRepository.findById(id.intValue());

        if (parceiroExistenteOpt.isEmpty()) {
            throw new EntityNotFoundException("Parceiro não encontrado");
        }

        Parceiro parceiroExistente = parceiroExistenteOpt.get();

        parceiroExistente.setNome(parceiroAtualizado.getNome());
        parceiroExistente.setTipo(parceiroAtualizado.getTipo());

        parceiroRepository.save(parceiroExistente);
    }


}
