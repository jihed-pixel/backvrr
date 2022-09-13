package com.yobitrust.HachCovid19Back.Controllers;

import com.yobitrust.HachCovid19Back.Models.RequestModels.LoginRequestModel;
import com.yobitrust.HachCovid19Back.Models.MedicalService;
import com.yobitrust.HachCovid19Back.Repositories.MedicalServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MedicalServiceController {
    @Autowired
    private MedicalServiceRepository medicalServiceRepository;
    @CrossOrigin(origins ="https://vrr-sousse.web.app/" )
    @GetMapping("/logout")
    public ResponseEntity logout(){
        System.out.println("logout");
        return  ResponseEntity.ok(null);
    }
    @CrossOrigin(origins ="https://vrr-sousse.web.app/" )
    @PostMapping("/cc")
    public ResponseEntity addMedicalService(@RequestBody  MedicalService model){

        MedicalService  service= new MedicalService();
        if (model==null ||model.getPassword()==null || model.getUsername() ==null)
            return ResponseEntity.ok("Please enter the username and the password ");
        System.out.println(model.getPassword() +"   "+model.getUsername());
        MedicalService medicalService=medicalServiceRepository.findByUsernameAndPassword(model.getUsername(),model.getPassword());
        System.out.println(medicalService);
        if(medicalService !=null){
            return   ResponseEntity.ok("Username or/and password is/are exist");
        }
        else {
            service.setUsername(model.getUsername());
            service.setPassword(model.getPassword());
            service.setAddress(model.getAddress());
            service.setHospitalName(model.getHospitalName());
            service.setMedicalServiceName(model.getMedicalServiceName());
            medicalServiceRepository.save(service);
            return ResponseEntity.ok("Ok");
        }
    }
    @CrossOrigin(origins ="https://vrr-sousse.web.app/" )
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestModel model)
    {
        System.out.println(model.getPassword()+" "+model.getUsername());
        if (model==null ||model.getPassword()==null || model.getUsername() ==null)
            return ResponseEntity.ok("Please enter the password and the username");
       // System.out.println(password);
        MedicalService medicalService=medicalServiceRepository.findByUsernameAndPassword(model.getUsername(),model.getPassword());
        System.out.println(medicalService);
        if(medicalService ==null){
            return   ResponseEntity.ok("Username or/and password is/are incorrect");
        }
       System.out.println(medicalService.toString());
        return  ResponseEntity.ok(medicalService);
    }
}
