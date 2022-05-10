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

    @FindBy(xpath = "(//td[@class='action-cell grid-cell grid-body-cell'][1])[1]")
    public WebElement firstRoll3dots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//a")
    public List<WebElement> firstRoll3dotsDropdown;

    @FindBy(xpath = "//th//input[@type='checkbox']")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    public List<WebElement> listOfAllCheckBoxes;
    
    

    
    
}

