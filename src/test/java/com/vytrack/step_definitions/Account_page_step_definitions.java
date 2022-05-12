package com.vytrack.step_definitions;

import com.vytrack.pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Account_page_step_definitions {
    AccountPage accountPage = new AccountPage();


    @When("click on filters")
    public void click_on_filters() {
        accountPage.filter.click();
    }
    @Then("assert filters:")
    public void assert_filters(List<String> expectedFilterOptions) {
        List<String> actualFilterOptions = new ArrayList<>();
        for (WebElement filtersOption : accountPage.filtersOptions) {
            actualFilterOptions.add(filtersOption.getText().replace(": All",""));
        }

        Assert.assertEquals(expectedFilterOptions,actualFilterOptions);
    }

}
