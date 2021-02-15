package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.springframework.core.SpringVersion;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {

        @FindBy(css = "menu-item-70")
        private WebElementFacade accountLink;

        //@FindBy(css = "a[title*='Log']")
        //private WebElementFacade loginLink;

        //@FindBy(css ="a[title= 'Register']")
        //private WebElementFacade registerLink;
        //@FindBy (css = "#search")
        //private WebElementFacade searchField;
        //@FindBy(css = "button[title='Search']")
        //private WebElementFacade searchIcon;

        public void clickAccountLink(){ clickOn(accountLink);}
        //public void clickLoginLink() {clickOn(loginLink);}
        //public void clickRegisterLink() { clickOn(registerLink);}
        //public void setSearchField(String text ){typeInto(searchField,text);}
        //public void clickSearchIcon(){clickOn(searchIcon); }
}
