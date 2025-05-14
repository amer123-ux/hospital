package com.hospital.patients.contrloller;


import com.hospital.patients.service.PatienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patints")
public class ParientController {
    @Autowired
    private PatienService patienService;   //this called bean  dependency injection is design pattern
                                           // inversion controll

    @GetMapping("/print_names")   //http get request
    public List<String> PatinetName(){
      return  this.patienService.PrintName();
    }

    @GetMapping("/filterName")
    public ResponseEntity GetFilteredName(){
        return ResponseEntity.ok( patienService.GetNameAfterFilter("yousef"));
    }

    @GetMapping("/indexName")
    public ResponseEntity GetIndexName(){
        return  ResponseEntity.ok(patienService.IndexName());
    }

    @GetMapping("/GetPatiens")
    public ResponseEntity GetPatiens(){
        return  ResponseEntity.ok(patienService.GetListPatients());
    }
}
