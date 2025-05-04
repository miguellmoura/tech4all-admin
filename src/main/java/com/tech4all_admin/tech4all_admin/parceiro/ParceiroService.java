package com.tech4all_admin.tech4all_admin.parceiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParceiroService {

    private final ParceiroRepository parceiroRepository;

    @Autowired
    public ParceiroService(ParceiroRepository parceiroRepository) {
        this.parceiroRepository = parceiroRepository;
    }


    public void createParceiro(ParceiroDTO parceiroDTO) {
        Parceiro parceiro = new Parceiro();
        parceiro.setName(parceiroDTO.getName());
        parceiroRepository.save(parceiro);
    }

}
