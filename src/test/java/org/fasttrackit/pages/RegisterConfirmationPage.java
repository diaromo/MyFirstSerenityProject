package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterConfirmationPage extends PageObject {

    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade registerConfirmationMsg;

    public void verifyRegisterMessage() {
        registerConfirmationMsg.shouldContainText("Hello romosandiana (not romosandiana? Log out)");
    }
}
