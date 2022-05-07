package com.vytrack.pages;


import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {
    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Login label
    @FindBy(className = "title")
    public WebElement loginLabel;

    //username
    @FindBy(id = "prependedInput")
    public WebElement userNameInput;

    //password
    @FindBy(css = "input[id='prependedInput2']")
    public WebElement passwordInput;

    //login button
    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginButton;

    //remember me text
    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeText;

}