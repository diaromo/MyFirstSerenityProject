package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class RegisterTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegisterTest(){
        registerSteps.navigateToRegister();
        //registerSteps.setRegistrationEmail("romosandiana1@gmail.com");
        //registerSteps.setRegistrationPassword("proiectacreditare1");
        //registerSteps.clickRegisterButton();
        //registerSteps.verifyRegisterMessage("Thank you for registering with Madison Island.");
    }
}
