package com.tech4all_admin.tech4all_admin.doacao;

public class ComparativoDTO {
    private Long totalComParceiro;
    private Long totalSemParceiro;

    public ComparativoDTO(Long totalComParceiro, Long totalSemParceiro) {
        this.totalComParceiro = totalComParceiro;
        this.totalSemParceiro = totalSemParceiro;
    }

    public Long getTotalComParceiro() {
        return totalComParceiro;
    }

    public Long getTotalSemParceiro() {
        return totalSemParceiro;
    }
}
