package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> modules;

    @FindBy(xpath = "//h1[@class='logo logo-text']")
    public WebElement pageLogo;

    @FindBy(xpath = "//i[@class='fa-share-square']")
    public WebElement shortcut;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement questions;

    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement menu;

    @FindBy(xpath = "//i[@class='mail-icon']")
    public WebElement email;

    @FindBy(id = "user-menu")
    public WebElement userMenu;

    @FindBy(xpath = "//button[@class='sidebar__toggle']")
    public WebElement sideToggle;

    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement sideWidgets;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement oroSubtitle;

}
