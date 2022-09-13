package com.yobitrust.HachCovid19Back.Models.RequestModels;

import java.util.Date;

public class AntecedentMedical {
    private String antecedent;
    private Double anciennete;
    private String traitement;
    private Boolean hemodialyse;
    private Boolean equilibre;
    private Double dose;
    private String molecule;
    private Integer duree; //la durée est en nombre de mois
    private Date datePrise;
    private Boolean episode_1;
    private Boolean getEpisode_x;
    private String handicap;
    private String atcd;
    private Boolean simple;
    private Boolean gpa;
    private  Boolean sa;
    private  String pathologie;
    private String autres;

    public AntecedentMedical() {
    }

    public AntecedentMedical(String antecedent, Double anciennete, String traitement, Boolean hemodialyse, Boolean equilibre, Double dose, String molecule, Integer duree, Date datePrise, Boolean episode_1, Boolean getEpisode_x, String handicap, String atcd, Boolean simple, Boolean gpa, Boolean sa, String pathologie, String autres) {
        this.antecedent = antecedent;
        this.anciennete = anciennete;
        this.traitement = traitement;
        this.hemodialyse = hemodialyse;
        this.equilibre = equilibre;
        this.dose = dose;
        this.molecule = molecule;
        this.duree = duree;
        this.datePrise = datePrise;
        this.episode_1 = episode_1;
        this.getEpisode_x = getEpisode_x;
        this.handicap = handicap;
        this.atcd = atcd;
        this.simple = simple;
        this.gpa = gpa;
        this.sa = sa;
        this.pathologie = pathologie;
        this.autres = autres;
    }

    public String getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(String antecedent) {
        this.antecedent = antecedent;
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

    public Boolean getEquilibre() {
        return equilibre;
    }

    public void setEquilibre(Boolean equilibre) {
        this.equilibre = equilibre;
    }

    public Double getDose() {
        return dose;
    }

    public void setDose(Double dose) {
        this.dose = dose;
    }

    public String getMolecule() {
        return molecule;
    }

    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Date getDatePrise() {
        return datePrise;
    }

    public void setDatePrise(Date datePrise) {
        this.datePrise = datePrise;
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

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getAtcd() {
        return atcd;
    }

    public void setAtcd(String ATCD) {
        this.atcd = ATCD;
    }

    public Boolean getSimple() {
        return simple;
    }

    public void setSimple(Boolean simple) {
        this.simple = simple;
    }

    public Boolean getGpa() {
        return gpa;
    }

    public void setGpa(Boolean gpa) {
        this.gpa = gpa;
    }

    public Boolean getSa() {
        return sa;
    }

    public void setSa(Boolean sa) {
        this.sa = sa;
    }

    public String getPathologie() {
        return pathologie;
    }

    public void setPathologie(String pathologie) {
        this.pathologie = pathologie;
    }

    public String getAutres() {
        return autres;
    }

    public void setAutres(String autres) {
        this.autres = autres;
    }
}
