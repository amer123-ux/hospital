package com.hospital.patients.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class inc {

    private UUID ID;
    private String  PatienName;
    private  Integer IncNo;

}
