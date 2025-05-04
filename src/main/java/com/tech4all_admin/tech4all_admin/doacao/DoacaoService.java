package com.tech4all_admin.tech4all_admin.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DoacaoService {
    private final DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public void createDoacao(DoacaoDTO doacaoDTO) {
        Doacao doacao = new Doacao();

        doacao.setId_doador(doacaoDTO.getIdDoador());
        doacao.setId_parceiro(doacaoDTO.getIdParceiro());
        doacao.setValor(doacaoDTO.getValor());
        doacao.setData_doacao(doacaoDTO.getDataDoacao());
        doacao.setStatus(doacaoDTO.getStatus());
        doacao.setQr_code_pix(doacaoDTO.getQrCodePix());

        doacaoRepository.save(doacao);
    }

    public ArrayList<DoacaoDTO> getDoacoes() {
        ArrayList<Doacao> doacoes = (ArrayList<Doacao>) doacaoRepository.findAll();
        ArrayList<DoacaoDTO> doacoesDTO = new ArrayList<>();

        for (Doacao doacao : doacoes) {
            DoacaoDTO doacaoDTO = new DoacaoDTO();
            doacaoDTO.setIdDoador(doacao.getId_doador());
            doacaoDTO.setIdParceiro(doacao.getId_parceiro());
            doacaoDTO.setValor(doacao.getValor());
            doacaoDTO.setDataDoacao(doacao.getData_doacao());
            doacaoDTO.setStatus(doacao.getStatus());
            doacaoDTO.setQrCodePix(doacao.getQr_code_pix());

            doacoesDTO.add(doacaoDTO);
        }

        return doacoesDTO;
    }
}
