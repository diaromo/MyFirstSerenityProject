package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest(){
        loginSteps.navigateToLogin();
        loginSteps.setEmail("romosandiana@gmail.com");
        loginSteps.setPassword("lemne18");
        loginSteps.clickLoginButton();
        loginSteps.verifyHelloMessage("Diana Romosan");
    }
}
