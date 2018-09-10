package core.pageobject;


import static core.constant.AndroidConstant.PACKAGE_NAME;

import core.manager.UiManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private AndroidDriver driver;
    private UiManager uiManager;

    // Элементы страницы
    private By loginField = By.id(PACKAGE_NAME + ":id/login");
    private By passwordField = By.id(PACKAGE_NAME + ":id/password");
    private By signInButton = By.id(PACKAGE_NAME + ":id/sign_in_button");
    private By checkBoxCloseSessions = By.id(PACKAGE_NAME + ":id/close_session");

    // Элементы дилога выбора тестового сервера
    private By dropdownListServer = By.id(PACKAGE_NAME + ":id/server");
    private By selectServer = By.xpath("//android.widget.CheckedTextView[@index='2']");
    private By okButton = By.id("android:id/button1");


    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        uiManager = new UiManager(driver);
    }

    public LoginPage authorizationDevServer() {
        fillLogin("dart_teppe_ya");
        fillPassword("Poiulkjh0987@");
        tapCheckBoxCloseSessions();
        longTapSignInButton();
        tapDropdownListServer();
        tapSelectServer();
        tapOkButton();
        signInButton();
        return this;
    }

    public LoginPage fillLogin(String inputText) {
        uiManager.inputField(loginField, inputText);
        return this;
    }

    public LoginPage fillPassword(String inputText) {
        uiManager.inputField(passwordField, inputText);
        return this;
    }

    public LoginPage signInButton() {
        uiManager.waitVisiblEelement(signInButton);
        uiManager.clickButton(signInButton);
        return this;
    }

    public LoginPage tapCheckBoxCloseSessions() {
        uiManager.waitVisiblEelement(checkBoxCloseSessions);
        uiManager.clickButton(checkBoxCloseSessions);
        return this;
    }

    public LoginPage longTapSignInButton() {
        uiManager.longTap(PACKAGE_NAME + ":id/sign_in_button");
        return this;
    }

    public LoginPage tapDropdownListServer() {
        uiManager.waitVisiblEelement(dropdownListServer);
        uiManager.clickElement(dropdownListServer);
        return this;
    }

    public LoginPage tapSelectServer() {
        uiManager.waitVisiblEelement(selectServer);
        uiManager.clickElement(selectServer);
        return this;
    }

    public LoginPage tapOkButton() {
//        uiManager.waitVisiblEelement(okButton);
//        uiManager.clickElement(okButton);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
        driver.findElement(By.id("android:id/button1")).click();
        return this;
    }

}
