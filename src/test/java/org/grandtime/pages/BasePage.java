package org.grandtime.pages;

import org.grandtime.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Tasks']")
    private WebElement task;


    public WebElement getTask() {
        return task;
    }
}
