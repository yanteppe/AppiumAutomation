package core.manager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UiManager {
    AndroidDriver driver;


    public UiManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);

    }

    public void clickElement(By locator) {
        getElement(locator).click();
    }

    public void longTap(String locatorElement) {
        TouchAction action = new TouchAction(driver);
        MobileElement element = (MobileElement) driver.findElementById(locatorElement);
        action.longPress(element).perform().release();
    }

    public void clickButton(By locator) {
        clickElement(locator);
    }

    public void clearField(By locator) {
        getElement(locator).clear();
    }

    public void inputField(By locator, String inputText) {
       clearField(locator);
       getElement(locator).sendKeys(inputText);
    }

    public void waitVisiblEelement(By expectedElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(getElement(expectedElement)));
    }

    public void assertion(String expectedValue, By locatorElement) {
        WebElement element = getElement(locatorElement);
        String actualValue = element.getText();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
