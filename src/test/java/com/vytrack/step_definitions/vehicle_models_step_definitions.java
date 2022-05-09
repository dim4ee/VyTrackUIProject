package com.vytrack.step_definitions;

import com.vytrack.pages.MainPage;
import com.vytrack.pages.VehicleModelsPage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class vehicle_models_step_definitions {

    MainPage mainPage = new MainPage();
    VehicleModelsPage vehicleModelsPage = new VehicleModelsPage();

    @When("user go to {string} and open {string}")
    public void userGoToAndOpen(String module, String dropdown) {

        for (WebElement eachModule : mainPage.modules) {

            if(eachModule.getText().equalsIgnoreCase(module)){
                Actions actions = new Actions(Driver.getDriver());
                actions.moveToElement(eachModule).perform();

                for (WebElement modulesDropdown : mainPage.modulesDropdowns) {

                    if (modulesDropdown.getText().equalsIgnoreCase(dropdown)){
                        modulesDropdown.click();
                    }

                }

            }
        }
    }

    @Then("user should see alert {string}")
    public void user_should_see_alert(String expectedAlertMessage) {

        if(mainPage.alertMessage.isDisplayed()){
            String actualAlertMessage = mainPage.alertMessage.getText();
            Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
        }else {
            Assert.assertTrue(false);
        }
    }

    @Then("user should see web table with following column names:")
    public void user_should_see_web_table_with_following_column_names(List<String> expectedTableHeads) {
        List<String> actualTableHeads = new ArrayList<>();

        for (int i = 1; i <=10; i++) {

            actualTableHeads.add(vehicleModelsPage.tableHeads.get(i).getText());

        }

        Assert.assertEquals(expectedTableHeads,actualTableHeads);

    }

}
