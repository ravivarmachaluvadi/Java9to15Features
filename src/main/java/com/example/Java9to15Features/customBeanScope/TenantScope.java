package com.example.Java9to15Features.customBeanScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.AbstractRequestAttributesScope;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TenantScope extends AbstractRequestAttributesScope {
    private Map<String, Object> tenantScope = Collections.synchronizedMap(new HashMap<>());
    private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {

        Object scopedObject = tenantScope.get(name);

        if (scopedObject == null) {
            scopedObject = objectFactory.getObject();
            tenantScope.put(name, scopedObject);
        }
        return scopedObject;

    }

    @Override
    public Object remove(String name) {

        Object scopedObject = tenantScope.get(name);
        if (scopedObject != null) {
            tenantScope.remove(name);
            return scopedObject;
        }
        else {
            return null;
        }
    }

    @Override
    public void registerDestructionCallback(String name, Runnable runnable) {
        destructionCallbacks.put(name, runnable);
    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    protected int getScope() {
        return 0;
    }

    @Override
    public String getConversationId() {
        return "tenant";
    }
}
