package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.ECG;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.TdmTho;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.Thorax;

import java.util.ArrayList;
import java.util.List;

public class ExamRadio_ParaCli {
    List<Thorax> thoraxes;
    List<TdmTho> tdmThos;
    List<ECG> ecgs;

    public ExamRadio_ParaCli() {
        this.thoraxes=new ArrayList<>();
        this.tdmThos=new ArrayList<>();
        this.ecgs=new ArrayList<>();
    }

    public ExamRadio_ParaCli(List<Thorax> thoraxes, List<TdmTho> tdmThos, List<ECG> ecgs) {
        this.thoraxes = thoraxes;
        this.tdmThos = tdmThos;
        this.ecgs = ecgs;
    }

    public List<Thorax> getThoraxes() {
        return thoraxes;
    }

    public void setThoraxes(List<Thorax> thoraxes) {
        this.thoraxes = thoraxes;
    }

    public List<TdmTho> getTdmThos() {
        return tdmThos;
    }

    public void setTdmThos(List<TdmTho> tdmThos) {
        this.tdmThos = tdmThos;
    }

    public List<ECG> getEcgs() {
        return ecgs;
    }

    public void setEcgs(List<ECG> ecgs) {
        this.ecgs = ecgs;
    }
}
