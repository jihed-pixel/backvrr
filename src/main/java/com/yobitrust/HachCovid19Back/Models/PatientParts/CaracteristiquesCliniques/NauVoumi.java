package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import java.util.Date;

public class NauVoumi  extends Symptome{

    private Integer nbEpisodes;
    public NauVoumi(Integer nbEpisodes,Date dateD, Date dateF) {
        super(dateD,dateF);
        this.nbEpisodes=nbEpisodes;
    }

    public NauVoumi() {
        super();
    }

    public Integer getNbEpisodes() {
        return nbEpisodes;
    }

    public void setNbEpisodes(Integer nbEpisodes) {
        this.nbEpisodes = nbEpisodes;
    }
}
