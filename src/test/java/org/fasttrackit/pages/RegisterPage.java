package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "middlename")
    private WebElementFacade midNameField;

    @FindBy(name = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;

    @FindBy(id = "password")
    private WebElementFacade registerPasswordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = ".button[title=Register]")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setMidNameField(String MidName){
        typeInto(midNameField, MidName);
    }
    public void setLastNameField(String LastName) {
        typeInto(lastNameField,LastName);
    }
    public void setEmailAddressField(String emailAddress) {
        typeInto(emailAddressField,emailAddress);
    }
    public void setRegisterPasswordField(String registerPassword){
        typeInto(registerPasswordField, registerPassword);
    }
    public void setConfirmationField(String confirmationPassword){
        typeInto(confirmationField, confirmationPassword);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}
