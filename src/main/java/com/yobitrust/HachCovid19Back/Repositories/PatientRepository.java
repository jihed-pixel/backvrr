package com.yobitrust.HachCovid19Back.Repositories;


import com.yobitrust.HachCovid19Back.Models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PatientRepository  extends MongoRepository<Patient,Long> {
    Patient findByCinAndMatricule(Integer cin, Integer matricule);
    Patient findByCinAndCinD(Integer cin, String cinD);
    Patient findByCin(Integer cin);
    List<Patient> findAll();

}
