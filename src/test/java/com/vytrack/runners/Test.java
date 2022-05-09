package com.vytrack.runners;

import com.vytrack.pages.MainPage;
import com.vytrack.pages.VehiclePage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import com.vytrack.utils.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test {


    @org.junit.Test
    public void test1() {

        VytrackUtils.loginAsStoreManager();

        MainPage mainPage = new MainPage();
        VehiclePage vehiclePage = new VehiclePage();

        for (WebElement eachModule : mainPage.modules) {

            if(eachModule.getText().equalsIgnoreCase("Fleet")){
                Actions actions = new Actions(Driver.getDriver());
                actions.moveToElement(eachModule).perform();

                for (WebElement modulesDropdown : mainPage.modulesDropdowns) {

                    if (modulesDropdown.getText().equalsIgnoreCase("Vehicles")){
                        modulesDropdown.click();
                    }

                }

            }
        }

        BrowserUtils.hover(vehiclePage.firstRoll3dots);

        BrowserUtils.sleep(3);

        for (WebElement option : vehiclePage.firstRoll3dotsDropdown) {

            System.out.println(option.getAttribute("title"));

        }


    }
}