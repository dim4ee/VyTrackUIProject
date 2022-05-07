package com.vytrack.step_definitions;

import com.vytrack.pages.MainPage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class help_feature_step_definitions {

    MainPage mainPage = new MainPage();

    @When("user click on get help link")
    public void user_click_on_get_help_link() {
        mainPage.helpLink.click();
    }

    @Then("assert user has been directed to {string} and title contains {string}")
    public void assertUserHasBeenDirectedToAndTitleContains(String expectedUrl, String expectedTitle) {
        BrowserUtils.switchWindowAndVerify(Driver.getDriver(),expectedUrl,expectedTitle);
    }
}
