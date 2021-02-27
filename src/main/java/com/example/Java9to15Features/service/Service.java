package com.example.Java9to15Features.service;

import com.example.Java9to15Features.DTO;
import com.example.Java9to15Features.customBeanScope.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DTO dto;

    @Autowired
    GreetingService greetingService;

    public void addData() {
        dto.names=new ArrayList<>();
        dto.names.add("Chaluvadi");
        System.out.println(" dto "+dto);

        System.out.println(" greetingService "+greetingService);
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



