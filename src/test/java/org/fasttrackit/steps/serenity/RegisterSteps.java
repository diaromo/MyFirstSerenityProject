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
        homePage.clickAccountLink();}

    @Step
    public void setRegistrationEmail(String firstName){registerPage.setRegistrationEmailField(firstName); }
    @Step
    public void setRegistrationPassword(String password){
        registerPage.setRegistrationPasswordField(password);
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
