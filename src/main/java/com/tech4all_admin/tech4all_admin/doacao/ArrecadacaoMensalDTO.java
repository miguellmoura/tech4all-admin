package com.tech4all_admin.tech4all_admin.doacao;

import java.math.BigInteger;

public class ArrecadacaoMensalDTO {
    private int mes;
    private BigInteger total;

    public ArrecadacaoMensalDTO(int mes, BigInteger total) {
        this.mes = mes;
        this.total = total;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }
}
