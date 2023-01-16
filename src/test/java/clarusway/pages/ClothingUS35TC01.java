package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class ClothingUS35TC01 {
    private WebDriver driver;

    public ClothingUS35TC01() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()='Join']")
    private  WebElement joinButton;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    @FindBy(id = "headlessui-menu-button-1")
    private WebElement groceryButton;

    @FindBy(id = "headlessui-menu-item-25")
    private WebElement clothing;

    @FindBy(id = "search")
    private  WebElement searchButton;

    @FindBy(tagName = "h3")
    private List<WebElement> products;


    public void login()  {
        driver= Driver.getDriver();
        driver.get("https://shop-pickbazar-rest.vercel.app/");
        joinButton.click();
        email.sendKeys("customer@demo.com");
        password.sendKeys("demodemo");
        loginButton.click();
    }

    @Test
    public  void t()  {
        ClothingUS35TC01 c=new ClothingUS35TC01();
        c.login();
    }


}
