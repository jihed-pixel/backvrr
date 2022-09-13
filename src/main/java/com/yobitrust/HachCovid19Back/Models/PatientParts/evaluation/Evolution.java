package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class Evolution {
    private Date dateS;
    private String typeS;

    public Evolution() {
    }

    public Evolution(Date dateS, String typeS) {
        this.dateS = dateS;
        this.typeS = typeS;
    }

    public Date getDateS() {
        return dateS;
    }

    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }

    public String getTypeS() {
        return typeS;
    }

    public void setTypeS(String typeS) {
        this.typeS = typeS;
    }
}
