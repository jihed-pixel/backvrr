package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

import java.util.Date;

public class ContactEtroit {
    private String contact;
    private Integer idTun;
    private Date dateDebutC;
    private Date dateFinC ;

    public ContactEtroit() {
    }

    public ContactEtroit(String contact, Integer idTun, Date dateDebutC, Date dateFinC) {
        this.contact = contact;
        this.idTun = idTun;
        this.dateDebutC = dateDebutC;
        this.dateFinC = dateFinC;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getIdTun() {
        return idTun;
    }

    public void setIdTun(Integer idTun) {
        this.idTun = idTun;
    }

    public Date getDateDebutC() {
        return dateDebutC;
    }

    public void setDateDebutC(Date dateDebutC) {
        this.dateDebutC = dateDebutC;
    }

    public Date getDateFinC() {
        return dateFinC;
    }

    public void setDateFinC(Date dateFinC) {
        this.dateFinC = dateFinC;
    }
}
