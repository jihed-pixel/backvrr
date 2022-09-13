package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

public class AVC extends AntecedentMedicaux {
    private Boolean episode_1;
    private Boolean getEpisode_x;
    private Double anciennete;
    private String traitement;
    private String handicap;

    public AVC() {
    }

    public AVC(Boolean episode_1, Boolean getEpisode_x, Double anciennete, String traitement, String handicap) {
        this.episode_1 = episode_1;
        this.getEpisode_x = getEpisode_x;
        this.anciennete = anciennete;
        this.traitement = traitement;
        this.handicap = handicap;
    }

    public Boolean getEpisode_1() {
        return episode_1;
    }

    public void setEpisode_1(Boolean episode_1) {
        this.episode_1 = episode_1;
    }

    public Boolean getGetEpisode_x() {
        return getEpisode_x;
    }

    public void setGetEpisode_x(Boolean getEpisode_x) {
        this.getEpisode_x = getEpisode_x;
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

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }
}
