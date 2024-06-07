package com.SimpleApp.Simple.Application.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Base {
    @Autowired
    protected AppiumDriver driver;
    @Autowired
    protected WebDriverWait wait;

//    @PostConstruct
//    private void init(){
//        PageFactory.initElements(this.driver,this);
//    }

    @PostConstruct
    private void init() {
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }



}
