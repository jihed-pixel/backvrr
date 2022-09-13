package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class EvolutionHo  extends Evolution {
    private String lieu;

    public EvolutionHo() {
        super();
    }

    public EvolutionHo(Date dateS, String typeS, String lieu) {
        super(dateS, typeS);
        this.lieu = lieu;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
