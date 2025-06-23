package com.tech4all_admin.tech4all_admin.doacao;

import java.math.BigDecimal;

public class ComparativoDTO {
    private BigDecimal totalComParceiro;
    private BigDecimal totalSemParceiro;

    public ComparativoDTO(BigDecimal totalComParceiro, BigDecimal totalSemParceiro) {
        this.totalComParceiro = totalComParceiro;
        this.totalSemParceiro = totalSemParceiro;
    }

    public BigDecimal getTotalComParceiro() {
        return totalComParceiro;
    }

    public BigDecimal getTotalSemParceiro() {
        return totalSemParceiro;
    }
}
