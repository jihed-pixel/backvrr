package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

public class Diabete extends AntecedentMedicaux{
    private Double anciennete;
    private String traitement;
    private Boolean equilibre;

    public Diabete() {
    }

    public Diabete(Double anciennete, String traitement, Boolean equilibré) {
        this.anciennete = anciennete;
        this.traitement = traitement;
        this.equilibre = equilibré;
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

    public Boolean getEquilibre() {
        return equilibre;
    }

    public void setEquilibre(Boolean equilibré) {
        this.equilibre= equilibré;
    }
}
