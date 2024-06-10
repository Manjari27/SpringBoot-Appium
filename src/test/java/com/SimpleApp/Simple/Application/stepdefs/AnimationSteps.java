package com.SimpleApp.Simple.Application.stepdefs;
import com.SimpleApp.Simple.Application.page.AnimationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
public class AnimationSteps {

    @Autowired
    private AnimationPage animationPage;


    @Given("User is on Demo App Home Page")
    public void userIsOnDemoAppHomePage() {
        System.out.println("Home page is displayed");
    }

    @When("User click on Animation Button")
    public void userClickOnAnimationButton() {
        animationPage.getFirstPage().ClickAnimation();
    }

    @Then("User should be navigated to Animation Page")
    public void userShouldBeNavigatedToAnimationPage() {
        System.out.println("Animation Page is displayed");
    }

    @When("User click Graphics button")
    public void userClickGraphicsButton() {
        animationPage.secondPage().clickGraphics();
    }

    @Then("User should be taken to Graphics page")
    public void userShouldBeTakenToGraphicsPage() {
        System.out.println("Graphics page is displayed");
    }
}
