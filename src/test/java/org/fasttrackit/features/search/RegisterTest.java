package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
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
        registerSteps.setFirstName("Maria");
        registerSteps.setMidName("Ioana");
        registerSteps.setLastName("Campioana");
        registerSteps.setEmail("MariaIoana3@campioana.com");
        registerSteps.setPassword("12345b");
        registerSteps.setConfirmationP("12345b");
        registerSteps.clickRegisterButton();
        //registerSteps.verifyRegisterMessage("Thank you for registering with Madison Island.");
    }
}
