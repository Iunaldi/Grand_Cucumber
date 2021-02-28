package org.grandtime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage{

    @FindBy(xpath = "//p[.='Your balance']")
    private WebElement yourbalance;


    public WebElement getYourbalance() {
        return yourbalance;
    }

}
