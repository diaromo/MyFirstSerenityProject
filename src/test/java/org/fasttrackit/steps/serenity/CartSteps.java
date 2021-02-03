package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class CartSteps {

        private HomePage homePage;
        private ProductPage productPage;
        private CartPage cartPage;

    @Step
    public void hoverAndClickAccessories() {
        productPage.hoverAccessories();
        productPage.clickJewelry();
    }
}
