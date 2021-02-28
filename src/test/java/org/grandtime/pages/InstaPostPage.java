package org.grandtime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.security.PrivateKey;

public class InstaPostPage extends InstaBasePage {

    @FindBy(className = "fr66n")
    private WebElement likeButton;


    @FindBy(xpath = "//span[@class='fr66n']/button/div/span/child::*")
    private WebElement likeStatus;

    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement instaLoginButton;



    public WebElement getLikeButton() {
        return likeButton;
    }

    public WebElement getLikeStatus() {
        return likeStatus;
    }

    public WebElement getInstaLoginButton() {
        return instaLoginButton;
    }
}
