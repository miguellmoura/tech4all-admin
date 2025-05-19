package com.tech4all_admin.tech4all_admin.parceiro;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parceiro_seq")
    @SequenceGenerator(name = "parceiro_seq", sequenceName = "parceiro_seq", allocationSize = 1)
    private Long id;

    @NotNull
    private String nome;

    public Parceiro() {}

    public Parceiro(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
