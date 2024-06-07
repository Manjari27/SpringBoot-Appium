package com.SimpleApp.Simple.Application.Config;

import com.SimpleApp.Simple.Application.annotation.LazyConfiguration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@LazyConfiguration
@Profile("!parallel")
public class DriverConfig {
    @Value("${default.timeout:30}")
    private int timeout;

    public AppiumDriver driver;
//    @Bean
//    public WebDriver chromeDriver(){
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }

    @Bean
    public AppiumDriver appiumDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Galazy Tab Active2");
        options.setApp("C:\\Users\\manjara\\Desktop\\APP Launcher\\spring-selenium\\spring-selenium\\src\\main\\resources\\ApiDemos-debug.apk");
        driver=new AppiumDriver(new URL("http://127.0.0.1:4723"),options);
        return driver;
    }

    @Bean
    public WebDriverWait webDriverWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }
}
