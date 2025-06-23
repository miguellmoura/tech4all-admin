package com.tech4all_admin.tech4all_admin.doacao;

import com.tech4all_admin.tech4all_admin.doador.Doador;
import com.tech4all_admin.tech4all_admin.parceiro.Parceiro;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_doador", referencedColumnName = "id")
    @NotNull
    private Doador doador;

    @ManyToOne
    @JoinColumn(name = "id_parceiro", referencedColumnName = "id")
    private Parceiro parceiro;

    @NotNull
    private BigDecimal valor;

    private LocalDate data_doacao;

    @NotNull
    private String status;

    @NotNull
    private String qr_code_pix;

    public Doacao() {}

    public Doacao(Integer id, Doador doador, Parceiro parceiro, BigDecimal valor, LocalDate data_doacao, String status, String qr_code_pix) {
        this.id = id;
        this.doador = doador;
        this.parceiro = parceiro;
        this.valor = valor;
        this.data_doacao = data_doacao;
        this.status = status;
        this.qr_code_pix = qr_code_pix;
    }
}
