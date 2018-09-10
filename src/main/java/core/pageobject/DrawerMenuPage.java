package core.pageobject;

import core.manager.UiManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DrawerMenuPage {
    private AndroidDriver driver;
    private UiManager uiManager;

    private By menuHamburgerButton = By.name("Open navigation drawer");
    private By myApplicationButton = By.id("...");
    private By newApplicationButton = By.id("...");
    private By gsmConnectionButton = By.id("...");
    private By techCapabilityButton = By.id("...");
    private By statisticButton = By.id("...");
    private By testsButton = By.id("...");

    public DrawerMenuPage(AndroidDriver driver) {
        this.driver = driver;
        uiManager = new UiManager(driver);
    }

    public DrawerMenuPage createNewApplication() {
        clickDrawerMenuButton();
        clickNewApplicationButton();
        return this;
    }

    public DrawerMenuPage clickDrawerMenuButton() {
        uiManager.clickButton(menuHamburgerButton);
        return this;
    }

    public DrawerMenuPage clickMyApplicationButton() {
        uiManager.waitVisiblEelement(myApplicationButton);
        uiManager.clickButton(myApplicationButton);
        return this;
    }

    public DrawerMenuPage clickNewApplicationButton() {
        uiManager.clickButton(newApplicationButton);
        return this;
    }

    public DrawerMenuPage clickGsmConnectionButton() {
        uiManager.clickButton(gsmConnectionButton);
        return this;
    }

    public DrawerMenuPage clickTechCapabilityButton() {
        uiManager.clickButton(techCapabilityButton);
        return this;
    }

    public DrawerMenuPage clickStatisticButton() {
        uiManager.clickButton(statisticButton);
        return this;
    }

    public DrawerMenuPage clickTestsButton() {
        uiManager.clickButton(testsButton);
        return this;
    }




}
