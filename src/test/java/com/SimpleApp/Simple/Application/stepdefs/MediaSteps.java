package com.SimpleApp.Simple.Application.stepdefs;
import com.SimpleApp.Simple.Application.page.MediaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

public class MediaSteps {
    @Autowired
    private MediaPage mediaPage;

    @When("User click on Media Button")
    public void userClickOnMediaButton() {
        mediaPage.getFirstPage().ClickMedia();
    }

    @Then("User should be navigated to Media Page")
    public void userShouldBeNavigatedToMediaPage() {
        System.out.println("Media page is displayed");
    }

    @When("User click MediaPlay button")
    public void userClickMediaPlayButton() {
        mediaPage.secondPage().clickMediaPlaye();
    }

    @Then("User should be taken to Media Player page")
    public void userShouldBeTakenToMediaPlayerPage() {
        System.out.println("Media graphics page is displayed");
    }
}
