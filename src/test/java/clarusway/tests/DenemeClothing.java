package clarusway.tests;

import clarusway.pages.ClothingUS35TC01;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DenemeClothing {

    @Test
    public  void t()  {
       ClothingUS35TC01 c=new ClothingUS35TC01();
       c.login();


    }
}
