package org.grandtime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskPage extends BasePage {

    @FindBy(xpath = "//img[@class='mat-card-image ng-star-inserted']")
    private List<WebElement> Posts;

    @FindBy(xpath = "//*[text()='How to do tasks']")
    private WebElement howToDo;


    public List<WebElement> getPosts() {
        return Posts;
    }
}
