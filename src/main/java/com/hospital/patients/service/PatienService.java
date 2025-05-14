package com.hospital.patients.service;

import com.hospital.patients.model.Patient;
import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service      // this annotation tell you that you can use this class in anothor class using dependancy injection
public class PatienService {

    @Autowired
    private PatientModel patientModel;


    public List<String> PrintName(){
        return  patientModel.GetNames();
    }

    public Patient GetNameAfterFilter(String name){
        String n = patientModel.GetNames().stream().filter(i -> i==name).findAny().orElse("nothing");
        Patient p =new Patient();
        p.setName(n.toUpperCase());
        return p;
    }

    public Patient IndexName(){
        Patient p =new Patient();

       p.setName(patientModel.GetNameByIndex());
       return  p;
    }
     public List<Patient> GetListPatients(){
         ArrayList<Patient> list =new ArrayList<>();
         patientModel.GetNames().forEach(name->list.add(new Patient(name)));
         return  list;
     }

//    public Patient GetNameInFormJeson(String name){
//        String n = patientModel.GetNames().
//
//    }
}
