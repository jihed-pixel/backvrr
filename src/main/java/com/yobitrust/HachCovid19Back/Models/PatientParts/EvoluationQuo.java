package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvoluationQuo {

    private HashMap<String,EvaluValueList> evaluations;
    private HashMap<String, UsiValueList> usiValues;
    private HashMap<String, AssRespList> assRespValues;
    private List<Evolution> evolutions;

    public EvoluationQuo() {
        this.usiValues= new HashMap<>();
        this.assRespValues= new HashMap<>();
        this.evaluations= new HashMap<>();
        this.evolutions= new ArrayList<>();

    }

    public EvoluationQuo(HashMap<String, EvaluValueList> evaluations, HashMap<String, UsiValueList> usiValues, HashMap<String, AssRespList> assRespValues,List<Evolution> evolutions) {
        this.evaluations = evaluations;
        this.usiValues = usiValues;
        this.assRespValues = assRespValues;
        this.evolutions=evolutions;
    }

    public HashMap<String, EvaluValueList> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(HashMap<String, EvaluValueList> evaluations) {
        this.evaluations = evaluations;
    }

    public HashMap<String, UsiValueList> getUsiValues() {
        return usiValues;
    }

    public void setUsiValues(HashMap<String, UsiValueList> usiValues) {
        this.usiValues = usiValues;
    }

    public HashMap<String, AssRespList> getAssRespValues() {
        return assRespValues;
    }

    public void setAssRespValues(HashMap<String, AssRespList> assRespValues) {
        this.assRespValues = assRespValues;
    }

    public List<Evolution> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Evolution> evolutions) {
        this.evolutions = evolutions;
    }
}
