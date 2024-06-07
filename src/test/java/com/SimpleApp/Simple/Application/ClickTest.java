package com.SimpleApp.Simple.Application;

import com.SimpleApp.Simple.Application.page.AnimationPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class ClickTest extends BaseTestNGTest{
    @Autowired
    private AnimationPage animationPage;

    @Test
    public void animationPageTest(){
        animationPage.getFirstPage().ClickAnimation();
        animationPage.secondPage().clickGraphics();
    }

}
