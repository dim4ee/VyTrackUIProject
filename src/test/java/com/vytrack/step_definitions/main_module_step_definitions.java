package com.vytrack.step_definitions;

import com.vytrack.pages.MainPage;
import com.vytrack.utils.VytrackUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class main_module_step_definitions {


    MainPage mainPage = new MainPage();


    @Given("user login as a driver")
    public void user_login_as_a_driver() {
        VytrackUtils.loginAsDriver();
    }

    @Then("assert module names:")
    public void assert_module_names(List<String> expectedModuleNames) {
        List<String> uiModuleNames = new ArrayList<>();
        for (WebElement module : mainPage.modules) {
            uiModuleNames.add(module.getText());
        }

        Assert.assertEquals(expectedModuleNames,uiModuleNames);
    }

    @When("user login as a sales manager")
    public void userLoginAsASalesManager() {
        VytrackUtils.loginAsSalesManager();

    }

    @When("user login as a store manager")
    public void userLoginAsAStoreManager() {
        VytrackUtils.loginAsStoreManager();

    }
}
