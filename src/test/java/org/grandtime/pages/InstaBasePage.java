package org.grandtime.pages;

import org.grandtime.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class InstaBasePage {
    public InstaBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
