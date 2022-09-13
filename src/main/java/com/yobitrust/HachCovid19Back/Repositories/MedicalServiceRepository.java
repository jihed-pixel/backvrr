package com.yobitrust.HachCovid19Back.Repositories;

import com.yobitrust.HachCovid19Back.Models.MedicalService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalServiceRepository extends MongoRepository<MedicalService,Long> {
    MedicalService findByUsernameAndPassword(String username,String password);
}
