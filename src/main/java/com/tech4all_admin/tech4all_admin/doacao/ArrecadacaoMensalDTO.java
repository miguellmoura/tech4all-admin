package com.tech4all_admin.tech4all_admin.doacao;

public class ArrecadacaoMensalDTO {
    private int mes;
    private double total;

    public ArrecadacaoMensalDTO(int mes, double total) {
        this.mes = mes;
        this.total = total;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
