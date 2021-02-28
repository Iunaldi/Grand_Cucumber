package org.grandtime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "inputEmail")
    private WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    private @FindBy(xpath = "//button[@type='submit']")
    WebElement signin;





    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {return password;}

    public WebElement getSignin() {
        return signin;
    }


}
