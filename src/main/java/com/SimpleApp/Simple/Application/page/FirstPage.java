package com.SimpleApp.Simple.Application.page;

import com.SimpleApp.Simple.Application.annotation.PageFragment;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;
@PageFragment
public class FirstPage extends Base{

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
    private WebElement animation;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Media\"]")
    private WebElement media;

    public void ClickAnimation(){
        System.out.println("Clicking the animation using the driver: "+ driver);
        System.out.println("Udid or device id: " + driver.getCapabilities().getCapability("udid"));
        animation.click();
    }

    public void ClickMedia(){
        System.out.println("Clicking the media using the driver: "+driver);
        System.out.println("Udid or device id: " + driver.getCapabilities().getCapability("udid"));
        media.click();
    }
}
