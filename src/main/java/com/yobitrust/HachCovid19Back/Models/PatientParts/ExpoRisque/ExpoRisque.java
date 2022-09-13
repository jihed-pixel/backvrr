package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

public class ExpoRisque {
    private ZoneRisque zoneRisque;
    private Arrivee arrivee;
    private Parcours parcours;
    private ContactEtroit contactEtroit;
    private AutreCritere autreCritere;
    private Quarantine quarantine;


    public ExpoRisque() {
    }

    public ExpoRisque(ZoneRisque zoneRisque, Arrivee arrivee, Parcours parcours, ContactEtroit contactEtroit, AutreCritere autreCritere, Quarantine quarantine) {
        this.zoneRisque = zoneRisque;
        this.arrivee = arrivee;
        this.parcours = parcours;
        this.contactEtroit = contactEtroit;
        this.autreCritere = autreCritere;
        this.quarantine = quarantine;
    }

    public ZoneRisque getZoneRisque() {
        return zoneRisque;
    }

    public void setZoneRisque(ZoneRisque zoneRisque) {
        this.zoneRisque = zoneRisque;
    }

    public Arrivee getArrivee() {
        return arrivee;
    }

    public void setArrivee(Arrivee arrivee) {
        this.arrivee = arrivee;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    public ContactEtroit getContactEtroit() {
        return contactEtroit;
    }

    public void setContactEtroit(ContactEtroit contactEtroit) {
        this.contactEtroit = contactEtroit;
    }

    public AutreCritere getAutreCritere() {
        return autreCritere;
    }

    public void setAutreCritere(AutreCritere autreCritere) {
        this.autreCritere = autreCritere;
    }

    public Quarantine getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Quarantine quarantine) {
        this.quarantine = quarantine;
    }
}
