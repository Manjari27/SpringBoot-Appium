package com.SimpleApp.Simple.Application.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        features = "src/test/resources/Features/Media.feature",
        glue = {"com.SimpleApp.Simple.Application.stepdefs"},monochrome = true,
        plugin = {
                "pretty",
        }
)
public class MediaRunner extends AbstractTestNGCucumberTests{
        @DataProvider(parallel = true)
        @Override
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
