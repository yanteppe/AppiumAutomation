package core.pageobject;

import core.manager.UiManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyApplicationPage {
    private AndroidDriver driver;
    private UiManager uiManager;

    private By applicationOnList = By.id("");

    public MyApplicationPage(AndroidDriver driver) {
        this.driver = driver;
        uiManager = new UiManager(driver);
    }

    public MyApplicationPage clickOnApplication(By locator) {
        uiManager.clickElement(locator);
        return this;
    }
}
