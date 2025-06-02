package com.tech4all_admin.tech4all_admin.parceiro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParceiroDTO {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("tipo")
    private String tipo;

    public ParceiroDTO() {
    }

    public ParceiroDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
