package clarusway.tests;

import clarusway.pages.ClothingUS35TC01;
import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day01_C01_DriverExample {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
//Verify title contains OrangeHRM.
//Use Driver Class.
    @Test
    public void test01() {//1.yol
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title = Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();
    }

    @Test
    public void test02() {//2.yol->Karl Hocanın tercihi!
        WebDriver driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        driver.quit();
    }

}