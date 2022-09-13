package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

import ch.qos.logback.core.pattern.color.ANSIConstants;

public class ATCDchir extends AntecedentMedicaux {
    private String atcd;
    public ATCDchir() {
    }

    public ATCDchir(String atcd) {
        this.atcd = atcd;
    }

    public String getAtcd() {
        return atcd;
    }

    public void setAtcd(String atcd) {
        this.atcd = atcd;
    }



}
