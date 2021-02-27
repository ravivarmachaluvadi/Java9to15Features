package com.example.Java9to15Features.customBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Scope("thread")
@Scope("tenant")
public class GreetingService {

    public List<String> list;
}
