package demo;//package test;

import api.android.settings.AndroidBase;
import core.pageobject.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginDemoTest extends AndroidBase {
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws Exception {
        initialization();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        loginPage
              .fillLogin("dart_teppe_ya")
              .fillPassword("Poiulkjh0987@")
              .signInButton();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}
