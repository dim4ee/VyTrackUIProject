package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='clearfix']//a[@href='/account']")
    public WebElement accountsList;

    @FindBy(xpath = "//div[@class='clearfix']//a[@href='/contact']")
    public WebElement contactsList;

    @FindBy(xpath = "//div[@class='clearfix']//a[@href='/contact/create']")
    public WebElement createContact;


}
