package com.vytrack.step_definitions;

import com.vytrack.pages.MainPage;
import com.vytrack.pages.PinbarHelpPage;
import com.vytrack.utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class pinbarHelp_step_definitions {

    MainPage mainPage = new MainPage();
    PinbarHelpPage pinbarHelpPage = new PinbarHelpPage();


    @When("user click on learn how to user this space link")
    public void user_click_on_learn_how_to_user_this_space_link() {
        mainPage.pinbarHelp.click();
    }


    @Then("user should see header {string}")
    public void userShouldSeeHeader(String expectedHeader) {
        BrowserUtils.waituntilTitleDisplay("How To Use Pinbar");
        String actualHeader = pinbarHelpPage.header.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }

    @And("user should see paragraph {string}")
    public void userShouldSeeParagraph(String expectedParagraph) {
        BrowserUtils.waituntilTitleDisplay("How To Use Pinbar");
        String actualParagraph = pinbarHelpPage.paragraph.getText();
        Assert.assertEquals(expectedParagraph,actualParagraph);
    }

    @And("user should see a picture displayed with src = {string}")
    public void userShouldSeeAPictureDisplayedWithSrc(String expectedSrc) {
        BrowserUtils.waituntilTitleDisplay("How To Use Pinbar");
        String actualSrc = pinbarHelpPage.image.getAttribute("src");
        Assert.assertTrue(actualSrc.contains(expectedSrc));
    }
}
