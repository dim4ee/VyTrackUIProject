package com.vytrack.step_definitions;

import com.github.javafaker.Faker;
import com.vytrack.pages.BasePage;
import com.vytrack.pages.CreateEventPage;
import com.vytrack.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calendar_Event_Page_Step_Definitions extends BasePage {

    String message;
    Faker faker = new Faker();
    CreateEventPage createEventPage = new CreateEventPage();

    @When("user write massage in the description field")
    public void user_write_massage_in_the_description_field() {
        message = faker.chuckNorris().fact();
        BrowserUtils.switchToIframe(createEventPage.iframeId);
        createEventPage.descriptionInput.sendKeys(message);

    }
    @Then("user should see the massage in the description field")
    public void user_should_see_the_massage_in_the_description_field() {
        Assert.assertEquals(message,createEventPage.descriptionInput.getText());

    }


}
