package com.tech4all_admin.tech4all_admin.doador;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Doador {

    @Id
    private Long id;

    public Doador() {}

    public Doador(Long id) {
        this.id = id;
    }
}
