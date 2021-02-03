package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    @FindBy(css = "li:nth-child(1) > div > div.actions > button > span > span")
    private WebElementFacade addToCartLink;

    public void clickAddToCart() { clickOn(addToCartLink);}

}
