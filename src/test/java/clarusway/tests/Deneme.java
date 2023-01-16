package clarusway.tests;

import clarusway.pages.ClothingUS35TC01;
import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deneme {
    private WebDriver driver;

    @Test
    public void test() throws InterruptedException {
       // driver=new ChromeDriver();
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        //WebElement grocery=Driver.getDriver().findElement(By.id("headlessui-menu-button-1"));
        //grocery.click();

        Thread.sleep(5000);
        Driver.getDriver().findElement(By.xpath("//button[text()='Join']")).click();
    }


}
