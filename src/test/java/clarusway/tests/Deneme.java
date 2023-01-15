package clarusway.tests;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deneme {
    private WebDriver driver;

    @Test
    public void test() {
       // driver=new ChromeDriver();
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement grocery=Driver.getDriver().findElement(By.id("headlessui-menu-button-129"));
        grocery.click();
    }
}
