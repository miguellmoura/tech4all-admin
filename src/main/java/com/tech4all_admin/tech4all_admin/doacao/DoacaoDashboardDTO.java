package com.tech4all_admin.tech4all_admin.doacao;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Setter
@Getter
public class DoacaoDashboardDTO {
    private ArrayList<String> labels;

    public DoacaoDashboardDTO(ArrayList<String> labels, ArrayList<Double> values) {
        this.labels = labels;
        this.values = values;
    }

    public DoacaoDashboardDTO (){}

    private ArrayList<Double> values;
}
