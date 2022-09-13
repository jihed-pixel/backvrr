package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class USIValue {
    private Date dateD;
    private Date dateF;
    private Integer saps2;
    private Integer apache2;
    private Integer sofa;

    public USIValue() {
    }

    public USIValue(Date dateD, Date dataF, Integer saps2, Integer apache2, Integer sofa) {
        this.dateD = dateD;
        this.dateF = dataF;
        this.saps2 = saps2;
        this.apache2 = apache2;
        this.sofa = sofa;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dataF) {
        this.dateF = dataF;
    }

    public Integer getSaps2() {
        return saps2;
    }

    public void setSaps2(Integer saps2) {
        this.saps2 = saps2;
    }

    public Integer getApache2() {
        return apache2;
    }

    public void setApache2(Integer apache2) {
        this.apache2 = apache2;
    }

    public Integer getSofa() {
        return sofa;
    }

    public void setSofa(Integer sofa) {
        this.sofa = sofa;
    }
}
