package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclePage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_page_step_definitions {

    VehiclePage vehiclePage = new VehiclePage();

    @And("user hover the three dots ... on the first roll")
    public void userHoverTheThreeDotsOnTheFirstRoll() {
        BrowserUtils.scrollToElement(vehiclePage.firstRoll3dots);
        BrowserUtils.hover(vehiclePage.firstRoll3dots);
    }
    @Then("user should see dropdown menu with options:")
    public void user_should_see_dropdown_menu_with_options(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();

        for (WebElement option : vehiclePage.firstRoll3dotsDropdown) {

            actualOptions.add(option.getAttribute("title"));

        }

        Assert.assertEquals(expectedOptions,actualOptions);

    }


}
