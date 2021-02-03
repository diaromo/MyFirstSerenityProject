package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(css=".hello strong")
    private WebElementFacade helloMsg;

    public void verifyHelloMessage(String userName){
        helloMsg.shouldContainText("Hello, "+userName+"!");
    }
}
