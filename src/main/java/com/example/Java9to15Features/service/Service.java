package com.example.Java9to15Features.service;

import com.example.Java9to15Features.DTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DTO dto;

    public void addData() {
        dto.names=new ArrayList<>();
        dto.names.add("Chaluvadi");
        System.out.println(dto);
    }
}


/*

Singleton firing request multiple times

com.example.Java9to15Features.DTO@b0b1175
com.example.Java9to15Features.DTO@b0b1175
com.example.Java9to15Features.DTO@b0b1175
com.example.Java9to15Features.DTO@b0b1175
com.example.Java9to15Features.DTO@b0b1175
com.example.Java9to15Features.DTO@b0b1175
*/



