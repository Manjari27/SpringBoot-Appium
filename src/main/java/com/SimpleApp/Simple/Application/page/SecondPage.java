package com.SimpleApp.Simple.Application.page;

import com.SimpleApp.Simple.Application.annotation.PageFragment;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@PageFragment
public class SecondPage extends Base{

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Layout Animations\"]")
    private WebElement LayoutAni;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"MediaPlayer\"]")
    private WebElement Mediaplayer;

    public void clickGraphics(){
        LayoutAni.click();
    }

    public void clickMediaPlaye(){
        Mediaplayer.click();
    }

}

