package com.tech4all_admin.tech4all_admin.doacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@Entity
public class Doacao {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer id_doador;

    @Null
    private Integer id_parceiro;

    @NotNull
    private Double valor;

    @Null
    private Date data_doacao;

    @NotNull
    private String status;

    @NotNull
    private String qr_code_pix;

    public Doacao () {
    }

    public Doacao(Integer id, Integer id_doador, Integer id_parceiro, Double valor, Date data_doacao, String status, String qr_code_pix) {
        this.id = id;
        this.id_doador = id_doador;
        this.id_parceiro = id_parceiro;
        this.valor = valor;
        this.data_doacao = data_doacao;
        this.status = status;
        this.qr_code_pix = qr_code_pix;
    }
}