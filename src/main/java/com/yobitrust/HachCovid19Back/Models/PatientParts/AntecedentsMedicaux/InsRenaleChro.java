package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

public class InsRenaleChro extends AntecedentMedicaux{
    private Double anciennete;
    private String traitement;
    private Boolean hemodialyse;

    public InsRenaleChro() {
    }

    public InsRenaleChro(Double anciennete, String traitement, Boolean hemodialyse) {
        this.anciennete = anciennete;
        this.traitement = traitement;
        this.hemodialyse = hemodialyse;
    }

    public Double getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(Double anciennete) {
        this.anciennete = anciennete;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }

    public Boolean getHemodialyse() {
        return hemodialyse;
    }

    public void setHemodialyse(Boolean hemodialyse) {
        this.hemodialyse = hemodialyse;
    }
}
