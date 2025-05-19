package com.tech4all_admin.tech4all_admin.doacao;

import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;

public class DoacaoDTO {
    private Integer id_doador;
    private Integer id_parceiro;
    private Double valor;
    private LocalDate data_doacao;
    private String status;
    private String qr_code_pix;

    // Construtores
    public DoacaoDTO() {}

    public DoacaoDTO(Integer id_doador, Integer id_parceiro, Double valor, LocalDate data_doacao, String status, String qr_code_pix) {
        this.id_doador = id_doador;
        this.id_parceiro = id_parceiro;
        this.valor = valor;
        this.data_doacao = data_doacao;
        this.status = status;
        this.qr_code_pix = qr_code_pix;
    }

    // Getters e Setters
    public Integer getIdDoador() {
        return id_doador;
    }

    public void setIdDoador(Integer id_doador) {
        this.id_doador = id_doador;
    }

    public Integer getIdParceiro() {
        return id_parceiro;
    }

    public void setIdParceiro(Integer id_parceiro) {
        this.id_parceiro = id_parceiro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDoacao() {
        return data_doacao;
    }

    public void setDataDoacao(LocalDate data_doacao) {
        this.data_doacao = data_doacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQrCodePix() {
        return qr_code_pix;
    }

    public void setQrCodePix(String qr_code_pix) {
        this.qr_code_pix = qr_code_pix;
    }
}

