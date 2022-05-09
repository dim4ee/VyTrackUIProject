package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage extends BasePage{

    public VehiclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='more-bar-holder'])[1]/div/a")
    public WebElement firstRoll3dots;

    @FindBy(xpath = "(//div[@class='more-bar-holder'])[1]//li[@class='launcher-item']/a")
    public List<WebElement> firstRoll3dotsDropdown;
    
    

    
    
}

