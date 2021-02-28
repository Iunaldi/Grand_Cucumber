package org.grandtime.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.grandtime.pages.LoginPage;
import org.grandtime.utils.Driver;
import org.openqa.selenium.WebElement;

public class Task {

    LoginPage loginPage=new LoginPage();



    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get("https://app.grandtime.org/r/YyZ5");
    }

    @Given("Enter the valid user name, password")
    public void enter_the_valid_user_name_password() {
        loginPage.getEmail().sendKeys("ilkerunaldi76@gmail.com");
        loginPage.getPassword().sendKeys("1*Ilker1");
    }

    @Given("Click sign in button")
    public void click_sign_in_button() {
        loginPage.getSignin().click();

    }

    @Given("Go to Dashboard")
    public void go_to_dashboard() {
        Asert

    }

    @Given("Click the Task")
    public void click_the_task() {

    }

    @Given("click the {string} post")
    public void click_the_post(String string) {

    }


    @Then("User should login instagram valid username and password instagram page")
    public void user_should_login_instagram_valid_username_and_password_instagram_page() {

    }

    @When("Click like button")
    public void click_like_button() {

    }

    @Then("heart turned liked")
    public void heart_turned_liked() {

    }

    @Then("Close the page")
    public void close_the_page() {

    }
}



