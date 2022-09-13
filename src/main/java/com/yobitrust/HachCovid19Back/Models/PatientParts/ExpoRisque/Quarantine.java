package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

import java.util.Date;

public class Quarantine {
    private  boolean respect;
    private Date dateDQu;
    private Date dateFDQu;

    public Quarantine() {
    }

    public Quarantine(boolean respect, Date dateDQu, Date dateFDQu) {
        this.respect = respect;
        this.dateDQu = dateDQu;
        this.dateFDQu = dateFDQu;
    }

    public boolean isRespect() {
        return respect;
    }

    public void setRespect(boolean respect) {
        this.respect = respect;
    }

    public Date getDateDQu() {
        return dateDQu;
    }

    public void setDateDQu(Date dateDQu) {
        this.dateDQu = dateDQu;
    }

    public Date getDateFDQu() {
        return dateFDQu;
    }

    public void setDateFDQu(Date dateFDQu) {
        this.dateFDQu = dateFDQu;
    }
}
