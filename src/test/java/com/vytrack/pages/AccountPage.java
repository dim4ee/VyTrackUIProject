package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage extends BasePage{

    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filter;

    @FindBy(xpath = "//div[@class='filter-item oro-drop']")
    public List<WebElement> filtersOptions;
}
