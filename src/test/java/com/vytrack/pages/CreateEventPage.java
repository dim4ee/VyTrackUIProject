package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateEventPage extends BasePage{

    public CreateEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='input-append']")
    public WebElement ownerInput;

    @FindBy(id = "oro_calendar_event_form_title-uid-62798b331da2c")
    public WebElement titleInput;

    //switch to iframe to use the description input
    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement descriptionInput;

    @FindBy(xpath = "//div[@class='controls recurrence-subview-control__items']//input[@class='recurrence-subview-control__number']")
    public WebElement repeatDaysInputBox;

    @FindBy(xpath = "//span[@title='Use calendar color']")
    public WebElement colorWhiteOption;

    @FindBy(xpath = "//span[@class='color']")
    public List<WebElement> colorOptionList;

    @FindBy(xpath = "//span[@title='Custom color...']")
    public WebElement customColorOption;

    @FindBy(id = "s2id_autogen3")
    public WebElement guestInput;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement startDate;

    @FindBy(xpath = "(//input[@placeholder='time'])[1]")
    public WebElement startTime;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement endDate;

    @FindBy(xpath = "(//input[@placeholder='time'])[2]")
    public WebElement endTime;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[allDay]']")
    public WebElement allDayEventCheckbox;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "//span/span/span[.='This value should not be blank.']")
    public WebElement repeatDaysValidationError;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[use_hangout]']")
    public WebElement callViaHangoutCheckbox;

    @FindBy(id = "s2id_autogen1")
    public WebElement addContent;
}
