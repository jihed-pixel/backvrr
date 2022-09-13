package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.Date;

public class EvolutionIHH extends Evolution {
    private Date dateH;
    private String hopital;
    private String service;
    private String ville;

    public EvolutionIHH() {
        super();
    }

    public EvolutionIHH(Date dateS, String typeS, Date dateH, String hopital, String service, String ville) {
        super(dateS, typeS);
        this.dateH = dateH;
        this.hopital = hopital;
        this.service = service;
        this.ville = ville;
    }

    public Date getDateH() {
        return dateH;
    }

    public void setDateH(Date dateH) {
        this.dateH = dateH;
    }

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
