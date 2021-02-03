package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterConfirmationPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade registerConfirmationMsg;

    public void verifyRegisterMessage() {
        registerConfirmationMsg.shouldContainText("Thank you for registering with Madison Island.");
    }
}
