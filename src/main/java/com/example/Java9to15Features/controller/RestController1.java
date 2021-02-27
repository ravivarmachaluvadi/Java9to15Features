package com.example.Java9to15Features.controller;

import com.example.Java9to15Features.DTO;
import com.example.Java9to15Features.customBeanScope.GreetingService;
import com.example.Java9to15Features.customBeanScope.TenantScope;
import com.example.Java9to15Features.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;


@RestController
public class RestController1 {

    @Autowired
    DTO dto;

    @Autowired
    GreetingService greetingService;

    @Autowired
    Service service;

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping
    public void Method(){

        dto.names=new ArrayList<>();
        dto.names.add("Ravi");

        service.addData();

        System.out.println(" dto "+dto);

        System.out.println(" greetingService "+greetingService);
    }
}

/*

scope = prototype

com.example.Java9to15Features.DTO@49119e3a
com.example.Java9to15Features.DTO@1e6e0da
*/



/*

@RequestScope

@RequestScope is a specialization of @Scope for a component whose lifecycle is bound to the current web request.

com.example.Java9to15Features.DTO@2cb3de76
com.example.Java9to15Features.DTO@2cb3de76
com.example.Java9to15Features.DTO@35ef2ecf
com.example.Java9to15Features.DTO@35ef2ecf
com.example.Java9to15Features.DTO@1559561d
com.example.Java9to15Features.DTO@1559561d*/



/*

@SessionScope

@SessionScope is a specialization of @Scope for a component whose lifecycle is bound to the current web session.

com.example.Java9to15Features.DTO@261a1eca
com.example.Java9to15Features.DTO@261a1eca
com.example.Java9to15Features.DTO@261a1eca
com.example.Java9to15Features.DTO@261a1eca
com.example.Java9to15Features.DTO@261a1eca
com.example.Java9to15Features.DTO@261a1eca
*/