package com.vytrack.utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BrowserUtils {

    /*
This method will accept int (in seconds) and execute Thread.sleep
for given duration
 */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }


    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }



    //This method will hover(WebElement element)
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).pause(3).perform();

    }


    //ScrollToElement(WebElement element) method
    public static void scrollToElement(WebElement element1) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //indexes:  0
        js.executeScript("arguments[0].scrollIntoView(true);", element1);

    }


    //waituntilTitleDisplay(String title) method
    public static void waituntilTitleDisplay(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //if contains it is enough
        wait.until(ExpectedConditions.titleContains(title));

    }

    //waituntilInvisibilityOfElement(WebElement element,int timeout) method
    public static void waituntilInvisibilityOfElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    //waituntilVisibilityOfElement(WebElement element,int timeout) method
    public static void waituntilVisibilityOfElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //waitUntilElementIsClickable(WebElement element,int timeout) method
    public static void waitUntilElementIsClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //doubleClick(WebElement element) method
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).perform();

    }

    //switch to iframe method
    public static void switchToIframe(WebElement element) {
        Driver.getDriver().switchTo().frame(element);

    }

    //switch to parent frame
    public static void switchToParentFrame() {
        Driver.getDriver().switchTo().parentFrame();

    }



}
