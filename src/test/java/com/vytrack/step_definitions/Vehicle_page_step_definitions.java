package com.vytrack.step_definitions;

import com.github.javafaker.Faker;
import com.vytrack.pages.VehiclePage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import com.vytrack.utils.VytrackUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_page_step_definitions {

    VehiclePage vehiclePage = new VehiclePage();
    Faker faker = new Faker();
    int randomNumber;

    @And("user hover the three dots ... on the first roll")
    public void userHoverTheThreeDotsOnTheFirstRoll() {
        VytrackUtils.waitTillLoaderMaskDisappear();
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


    @Then("assert all vehicle checkboxes are not selected")
    public void assertAllVehicleCheckboxesAreNotSelected() {

        for (WebElement eachCheckBox : vehiclePage.listOfAllCheckBoxes) {
            Assert.assertFalse(eachCheckBox.isSelected());

        }
    }

    @When("user click on select all checkbox")
    public void userClickOnSelectAllCheckbox() {
        vehiclePage.selectAllCheckbox.click();
    }

    @Then("assert all vehicle checkboxes are selected")
    public void assertAllVehicleCheckboxesAreSelected() {
        for (WebElement eachCheckBox : vehiclePage.listOfAllCheckBoxes) {
            Assert.assertTrue(eachCheckBox.isSelected());

        }
    }

    @When("deselect all checkboxes")
    public void deselectAllCheckboxes() {
        vehiclePage.selectAllCheckbox.click();
    }

    @And("select a random checkbox")
    public void selectARandomCheckbox() {

        randomNumber = faker.number().numberBetween(0, 24);
        vehiclePage.listOfAllCheckBoxes.get(randomNumber).click();
    }

    @Then("assert checkbox is selected")
    public void assertCheckboxIsSelected() {
        Assert.assertTrue(vehiclePage.listOfAllCheckBoxes.get(randomNumber).isSelected());
    }
}
