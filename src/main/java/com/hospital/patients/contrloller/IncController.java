package com.hospital.patients.contrloller;


import com.hospital.patients.model.inc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/inc")
public class IncController {


    @GetMapping("/incDetails")
    public inc GetPatienInc(){
        return  inc.builder().ID(UUID.randomUUID()).IncNo(12).PatienName("Yousef amer").build();
    }
}
