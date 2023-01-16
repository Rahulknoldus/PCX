package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.LaunchEmulator;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ShopCategories extends LaunchEmulator {


//    public AndroidDriver driver;


    @Given("that I am on the PCX app")
    public void that_i_am_on_the_pcx_app() throws MalformedURLException {
        System.out.println("Test started-----");
        LaunchEmulator.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) LaunchEmulator.driver.findElementById("pc.express.grocery.pickup.enterprise:id/btn_pcx_primer_get_started");
        el1.click();
        MobileElement el2 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button");
        el2.click();
        MobileElement el5 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
        el6.click();
        MobileElement el7 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) LaunchEmulator.driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Loblaws\"]");
        el8.click();


    }

    @When("I am on the Homepage")
    public void i_am_on_the_homepage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       Thread.sleep(5000);
        MobileElement el9 = (MobileElement) LaunchEmulator.driver.findElementById("pc.express.grocery.pickup.enterprise:id/btn_pcx_sign_in");
        el9.click();
        MobileElement el10 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.EditText");
        el10.sendKeys("rahul.kumar0@loblaw.ca");
        MobileElement el11 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText");
        el11.sendKeys("Rahulkumar@989764");
        MobileElement el12 = (MobileElement) LaunchEmulator.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.Button");
        el12.click();
    }

    @Then("I must be presented with a carousel to show the popular product categories.")
    public void i_must_be_presented_with_a_carousel_to_show_the_popular_product_categories() {
        // Write code here that turns the phrase above into concrete actions
        MobileElement el13 = (MobileElement) LaunchEmulator.driver.findElementById("pc.express.grocery.pickup.enterprise:id/category_carousel_title_text_view");
        String ElementText = el13.getText();
        Assert.assertEquals("Shop categories", ElementText);

    }
}





