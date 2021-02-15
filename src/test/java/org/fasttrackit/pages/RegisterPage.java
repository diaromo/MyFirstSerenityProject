package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade registrationEmailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordEmailField;

    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;

    public void setRegistrationEmailField(String email){typeInto(registrationEmailField, email); }
    public void setRegistrationPasswordField(String password){typeInto(passwordEmailField, password);}
    public void clickRegisterButton(){ clickOn(registerButton);}
}
