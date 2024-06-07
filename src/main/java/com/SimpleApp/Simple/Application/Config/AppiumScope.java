package com.SimpleApp.Simple.Application.Config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

import java.util.Objects;

public class AppiumScope extends SimpleThreadScope {
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object O=super.get(name,objectFactory);
        SessionId sessionId=((AppiumDriver)O).getSessionId();
        if(Objects.isNull(sessionId)){
            super.remove(name);
            super.get(name,objectFactory);
        }
        return O;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
    }
}
