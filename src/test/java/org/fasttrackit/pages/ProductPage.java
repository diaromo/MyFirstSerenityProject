package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css = "li.level0.nav-3.parent")
    private WebElementFacade accessoriesLink;

    @FindBy(css = "<a href=\"http://testfasttrackit.info/selenium-test/accessories/jewelry.html\" class=\"level1 \">Jewelry</a>")
    private WebElementFacade jewelryLink;

    public void hoverAccessories() { moveTo(String.valueOf(accessoriesLink));}
    public void clickJewelry() { clickOn(jewelryLink);}

}
