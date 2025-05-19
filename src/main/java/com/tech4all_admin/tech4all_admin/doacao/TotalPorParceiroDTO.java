package com.tech4all_admin.tech4all_admin.doacao;

public class TotalPorParceiroDTO {
    private String parceiro;
    private Double valorTotal;

    private Long idParceiro;
    private String nomeParceiro;
    private Double total;

    public TotalPorParceiroDTO(String parceiro, Double valorTotal) {
        this.parceiro = parceiro;
        this.valorTotal = valorTotal;
    }

    public TotalPorParceiroDTO(Long idParceiro, String nomeParceiro, Double total) {
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getIdParceiro() {
        return idParceiro;
    }

    public void setIdParceiro(Long idParceiro) {
        this.idParceiro = idParceiro;
    }

    public String getNomeParceiro() {
        return nomeParceiro;
    }

    public void setNomeParceiro(String nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
