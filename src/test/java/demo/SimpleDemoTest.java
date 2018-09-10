package demo;

      import api.android.settings.AndroidBase;
      import io.appium.java_client.TouchAction;
      import org.openqa.selenium.By;
      import org.openqa.selenium.support.ui.ExpectedConditions;
      import org.openqa.selenium.support.ui.WebDriverWait;
      import org.testng.annotations.AfterClass;
      import org.testng.annotations.BeforeTest;
      import org.testng.annotations.Test;

public class SimpleDemoTest extends AndroidBase {


    @BeforeTest
    public void setUp() throws Exception {
        initialization();
    }

    @Test
    public void loginTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,1);
//        driver.findElement(By.id("com.dartit.mobileagent.debug:id/login")).click();
//        driver.findElement(By.id("com.dartit.mobileagent.debug:id/login")).sendKeys("dart_teppe_ya");
//        driver.findElement(By.id("com.dartit.mobileagent.debug:id/password")).sendKeys("Poiulkjh0987@");
        TouchAction action = new TouchAction(driver);
        action.longPress(driver.findElement("By.id(\"com.dartit.mobileagent.debug:id/sign_in_button", "com.dartit.mobileagent.debug:id/sign_in_button")).release().perform();

//        driver.findElement(By.id("com.dartit.mobileagent.debug:id/sign_in_button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}

