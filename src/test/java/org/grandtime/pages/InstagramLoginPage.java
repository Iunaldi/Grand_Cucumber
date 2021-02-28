package org.grandtime.pages;

import org.grandtime.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage extends InstaBasePage{

    public InstagramLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    private WebElement instaUsername;

    @FindBy(name = "password")
    private WebElement instaPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement instaSubmitButton;

    @FindBy(xpath = "//*[text()='Not Now']")
    private WebElement notNow;

    public WebElement getInstaUsername() {
        return instaUsername;
    }

    public WebElement getInstaPassword() {
        return instaPassword;
    }

    public WebElement getInstaSubmitButton() {
        return instaSubmitButton;
    }

    public WebElement getNotNow() {
        return notNow;
    }
}
