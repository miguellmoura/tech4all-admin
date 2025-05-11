package com.tech4all_admin.tech4all_admin.doacao;

public class ArrecadacaoMensalDTO {
    private Integer mes;
    private Double valorTotal;

    public ArrecadacaoMensalDTO(Integer mes, Double valorTotal) {
        this.mes = mes;
        this.valorTotal = valorTotal;
    }

    public Integer getMes() {
        return mes;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
