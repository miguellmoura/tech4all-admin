package com.tech4all_admin.tech4all_admin.doacao;

import java.math.BigDecimal;

public class TotalPorParceiroDTO {
    private String parceiro;
    private BigDecimal valorTotal;

    private Integer idParceiro;
    private String nomeParceiro;
    private BigDecimal total;

    public TotalPorParceiroDTO(String parceiro, BigDecimal valorTotal) {
        this.parceiro = parceiro;
        this.valorTotal = valorTotal;
    }

    public TotalPorParceiroDTO(Integer idParceiro, String nomeParceiro, BigDecimal total) {
        this.idParceiro = idParceiro;
        this.nomeParceiro = nomeParceiro;
        this.total = total;
    }

    public String getParceiro() {
        return parceiro;
    }

    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getIdParceiro() {
        return idParceiro;
    }

    public void setIdParceiro(Integer idParceiro) {
        this.idParceiro = idParceiro;
    }

    public String getNomeParceiro() {
        return nomeParceiro;
    }

    public void setNomeParceiro(String nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
