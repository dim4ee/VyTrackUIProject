package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarHelpPage extends BasePage{

    public PinbarHelpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement header;

    @FindBy(xpath = "(//div[@class='clearfix']/p)[1]")
    public WebElement paragraph;

    @FindBy(xpath = "//div[@class='clearfix']/p/img")
    public WebElement image;

}
