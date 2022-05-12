package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleOdometerPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleOdometer_Step_Definitions {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    @Then("assert default page is {string}")
    public void assert_default_page_is(String expectedDefaultPage) {
        String actualDefaultPage = vehicleOdometerPage.pageNumber.getAttribute("value");
        Assert.assertEquals(expectedDefaultPage,actualDefaultPage);
    }
    @Then("assert default view per page is {string}")
    public void assert_default_view_per_page_is(String expectedViewPerPage) {
        String actualViewPerPage = vehicleOdometerPage.viewPerPage.getText();
        Assert.assertEquals(expectedViewPerPage,actualViewPerPage);
    }


    @Then("assert error message {string} is displayed")
    public void assertErrorMessageIsDisplayed(String expectedErrorMessage) {
        Assert.assertTrue(vehicleOdometerPage.vehicleOdometerErrorMessage.isDisplayed());
    }
}
