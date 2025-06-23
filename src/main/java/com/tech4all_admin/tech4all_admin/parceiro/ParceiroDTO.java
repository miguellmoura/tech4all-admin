package com.tech4all_admin.tech4all_admin.parceiro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParceiroDTO {

    private String nome;
    private String tipo;

    public ParceiroDTO() {}

    public ParceiroDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

