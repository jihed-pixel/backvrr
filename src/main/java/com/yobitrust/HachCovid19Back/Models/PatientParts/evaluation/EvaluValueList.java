package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.ArrayList;
import java.util.List;

public class EvaluValueList {
    private List<EvaluValue> evaluValues;

    public EvaluValueList() {
        this.evaluValues= new ArrayList<>();
    }

    public EvaluValueList(List<EvaluValue> evaluValues) {
        this.evaluValues = evaluValues;
    }

    public List<EvaluValue> getEvaluValues() {
        return evaluValues;
    }

    public void setEvaluValues(List<EvaluValue> evaluValues) {
        this.evaluValues = evaluValues;
    }
}

