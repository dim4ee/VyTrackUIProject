package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarPage;
import com.vytrack.pages.CreateEventPage;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.VytrackUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Create_recurring_calendar_event_step_definitions {
    CalendarPage calendarsPage = new CalendarPage();
    CreateEventPage createEventPage = new CreateEventPage();


    @When("user click on the Create Calendar Event")
    public void user_click_on_the_create_calendar_event() {
        VytrackUtils.waitTillLoaderMaskDisappear();
        calendarsPage.createCalendarEventBtn.click();
    }
    @When("user select repeat checkbox")
    public void user_select_repeat_checkbox() {
        createEventPage.repeatCheckbox.click();
    }
    @Then("user should see {int} by default in the repeat entry input")
    public void user_should_see_by_default_in_the_repeat_entry_input(int defaultNumber) {
        int actualNumber =Integer.parseInt(createEventPage.repeatDaysInputBox.getAttribute("value")) ;
        Assert.assertEquals(actualNumber,defaultNumber);

    }
    @When("user leave blank repeat entry input")
    public void user_leave_blank_repeat_entry_input() {
        createEventPage.repeatDaysInputBox.clear();
    }
    @Then("user should see alert message {string}")
    public void user_should_see_alert_message(String expectedAlertMessage) {
        Assert.assertEquals(createEventPage.repeatDaysValidationError.getText(),expectedAlertMessage);
    }

    @When("user enter {string} in repeat entry input")
    public void userEnterInRepeatEntryInput(String input) {
        createEventPage.repeatDaysInputBox.clear();
        createEventPage.repeatDaysInputBox.sendKeys(input);
    }
}
