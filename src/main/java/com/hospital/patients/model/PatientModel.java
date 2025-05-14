package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class PatientModel {

    List names = new ArrayList<>();

    PatientModel(){
        names.add("yousef");
        names.add("amer");
        names.add("said");
    }
    public List<String> GetNames(){
        return names;
    }

    public String GetNameByIndex(){
        return  names.get(1).toString();
    }
}
