package com.example.Java9to15Features.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;


public class DTO1 implements Scope {

    public List<String> names=new ArrayList<>();

    @Override
    public String value() {
        return null;
    }

    @Override
    public String scopeName() {
        return null;
    }

    @Override
    public ScopedProxyMode proxyMode() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
