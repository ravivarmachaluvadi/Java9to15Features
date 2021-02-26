package com.example.Java9to15Features;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@RequestScope
public class DTO {

    public List<String> names=new ArrayList<>();
}
