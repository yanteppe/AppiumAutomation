package application.connection;

import api.android.settings.AndroidBase;
import core.manager.UiManager;
import core.pageobject.DrawerMenuPage;
import core.pageobject.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InternetApplicationTest extends AndroidBase {
    LoginPage loginPage;
    UiManager uiManager;
    DrawerMenuPage drawerMenuPage;


    @BeforeClass(description = "Предусловия")
    public void setUp() throws Exception {
        initialization();
        loginPage = new LoginPage(driver);
        uiManager = new UiManager(driver);
        loginPage.authorizationDevServer();
        drawerMenuPage = new DrawerMenuPage(driver);
    }

    @Test(description = "Интернет - создание заявки")
    public void testOrderInternet() throws InterruptedException{
//        loginPage.longTapSignInButton();

    }

    @AfterClass(description = "Постусловия")
    public void tearDown() throws Exception {
        driver.quit();
    }

}
