import api.android.settings.AndroidBase;
import core.manager.UiManager;
import core.pageobject.DrawerMenuPage;
import core.pageobject.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementLocatorsTest extends AndroidBase {
    LoginPage loginPage;
    UiManager uiManager;
    DrawerMenuPage drawerMenuPage;


    @BeforeClass(description = "Предусловия")
    public void setUp() throws Exception {
        initialization();
        loginPage = new LoginPage(driver);
        uiManager = new UiManager(driver);
        drawerMenuPage = new DrawerMenuPage(driver);
    }

    @Test(description = "Проверка локаторов элементов")
    public void testElementLocators() throws InterruptedException{
        loginPage.tapCheckBoxCloseSessions();
        loginPage.longTapSignInButton();
        loginPage.tapDropdownListServer();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='https://eissd-dev.rt.ru/']")));

        String testText = driver.findElement(By.xpath("//*[@text='https://eissd-dev.rt.ru/']")).getText();
        System.out.println(testText);

        driver.findElement(By.xpath("//*[@text='https://eissd-dev.rt.ru/']")).click();
    }

    @AfterClass(description = "Постусловия")
    public void tearDown() throws Exception {
//        driver.quit();
    }

}