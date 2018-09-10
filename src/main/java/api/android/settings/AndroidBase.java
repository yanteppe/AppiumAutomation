package api.android.settings;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Настройки Appium для Android
 */
public class AndroidBase {
    public AndroidDriver driver;


    protected void initialization() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.8.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
//        capabilities.setCapability("platformVersion", "6.0.1");
//        capabilities.setCapability("deviceName", "b613c0df");
        capabilities.setCapability("deviceName", "Pixel_API_27");
        capabilities.setCapability("app", "C:/Dev/Android/MobileAgentTest/src/main/java/api/app/mobileagent/agent-debug.apk");
        capabilities.setCapability("appWaitActivity", "com.dartit.mobileagent.ui.LoginActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

}