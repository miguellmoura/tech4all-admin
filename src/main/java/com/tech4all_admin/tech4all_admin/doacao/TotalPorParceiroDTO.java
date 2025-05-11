package com.tech4all_admin.tech4all_admin.doacao;

public class TotalPorParceiroDTO {
    private String parceiro;
    private Double valorTotal;

    public TotalPorParceiroDTO(String parceiro, Double valorTotal) {
        this.parceiro = parceiro;
        this.valorTotal = valorTotal;
    }

    public String getParceiro() {
        return parceiro;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
