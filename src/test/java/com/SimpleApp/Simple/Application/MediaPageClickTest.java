package com.SimpleApp.Simple.Application;

import com.SimpleApp.Simple.Application.page.MediaPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class MediaPageClickTest extends BaseTestNGTest {
    @Autowired
    private MediaPage mediaPage;

    @Test
    public void ClickMedia(){
        mediaPage.getFirstPage().ClickMedia();
        mediaPage.secondPage().clickMediaPlaye();
    }

}
