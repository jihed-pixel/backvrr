package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

import java.util.Date;

public class ZoneRisque {
    private Boolean habite;
    private Date dateD;
    private Date dateF;
    private String villes;

    public ZoneRisque() {
    }

    public ZoneRisque(Boolean habite, Date dateD, Date dateF, String villes) {
        this.habite = habite;
        this.dateD = dateD;
        this.dateF = dateF;
        this.villes = villes;
    }

    public Boolean getHabite() {
        return habite;
    }

    public void setHabite(Boolean habite) {
        this.habite = habite;
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

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public String getVilles() {
        return villes;
    }

    public void setVilles(String villes) {
        this.villes = villes;
    }
}
