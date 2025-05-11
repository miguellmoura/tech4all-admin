package com.tech4all_admin.tech4all_admin.doacao;

public class ComparativoDTO {
    private Double totalComParceiro;
    private Double totalSemParceiro;

    public ComparativoDTO(Double totalComParceiro, Double totalSemParceiro) {
        this.totalComParceiro = totalComParceiro;
        this.totalSemParceiro = totalSemParceiro;
    }

    public Double getTotalComParceiro() {
        return totalComParceiro;
    }

    public Double getTotalSemParceiro() {
        return totalSemParceiro;
    }
}
