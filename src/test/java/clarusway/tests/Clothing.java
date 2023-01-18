package clarusway.tests;

import clarusway.pages.ClothingUS35TC01;
import org.testng.annotations.Test;

public class Clothing {

    @Test
    public void t() throws InterruptedException {
       // driver.get("https://shop-pickbazar-rest.vercel.app/");
       // driver.findElement(By.xpath("//*[text()='Join']")).click();
        ClothingUS35TC01 c = new ClothingUS35TC01();
        c.login();
    }



}
