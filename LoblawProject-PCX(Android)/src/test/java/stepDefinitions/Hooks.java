package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.LaunchEmulator;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends LaunchEmulator {

//    public AndroidDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "12.0");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel_5_API_31");
        desiredCapabilities.setCapability("appium:automationName", "appium");
        desiredCapabilities.setCapability("appium:noRest", true);
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "pc.express.grocery.pickup.enterprise");
        desiredCapabilities.setCapability("appActivity", "com.loblaw.common.view.MainActivity");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        LaunchEmulator.driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

//    @After
//    public void tearDown() {
//////        LaunchEmulator.driver.quit();
////        System.out.println("test completed:-------");
////    }

}
