package org.fasttrackit.steps.serenity;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterConfirmationPage;
import org.fasttrackit.pages.RegisterPage;


public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private RegisterConfirmationPage confirmationPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();

    }
    @Step
    public void setFirstName(String firstName){
        registerPage.setFirstNameField(firstName);
    }
    @Step
    public void setMidName(String MidName){
        registerPage.setMidNameField(MidName);
    }
    @Step
    public void setLastName(String lastName){
        registerPage.setLastNameField(lastName);
    }
    @Step
    public void setEmail(String email){
        registerPage.setEmailAddressField(email);
    }
    @Step
    public void setPassword(String password){
        registerPage.setRegisterPasswordField(password);
    }
    @Step
    public void setConfirmationP(String confirmationP){
        registerPage.setConfirmationField(confirmationP);
    }
    @Step
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }
    //@Step
    //public void verifyRegisterMessage(String s){
       //confirmationPage.verifyRegisterMessage("Thank you for registering with Madison Island.");
    //}
}
