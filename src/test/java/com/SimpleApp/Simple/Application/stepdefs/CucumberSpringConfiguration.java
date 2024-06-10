package com.SimpleApp.Simple.Application.stepdefs;


import com.SimpleApp.Simple.Application.SimpleApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;

@CucumberContextConfiguration
@SpringBootTest(classes = SimpleApplication.class)
@Scope("prototype")
public class CucumberSpringConfiguration {
}
