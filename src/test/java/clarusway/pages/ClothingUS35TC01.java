package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class ClothingUS35TC01 {
    private WebDriver driver;

    public ClothingUS35TC01() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Join']")////*[text()='Join']//(//li/button)[1]
    private WebElement joinButton;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "(//div/button/span)[1]")
    public WebElement groceryButton;

    @FindBy(xpath = "(//div/a)[6]")
    private WebElement clothing;

    @FindBy(id = "search")
    private WebElement searchButton;

    @FindBy(tagName = "h3")
    private List<WebElement> products;

    // @FindBy(id = "headlessui-menu-item-22")////span[.='Bakery']
    @FindBy(xpath = "//span[text()='Bakery']")////span[.='Bakery']
    public WebElement bakeryButton;

    @FindBy(xpath = "(//div/button)[6]")
    public WebElement sepeteEkleButonuBakery;

    @FindBy(xpath = "(//button[contains(@class,'cursor-pointer')])[3]")
    private WebElement bakeryMinusButtonCart;
    @FindBy(xpath = "((//button[contains(@class,'cursor-pointer')])[4]")
    private WebElement bakeryPlusButtonCart;
    @FindBy(xpath = "//button[contains(@class,'hidden product-cart')]")
    private WebElement cart;


    public void login()  {
        driver=Driver.getDriver();
        driver.get("https://shop-pickbazar-rest.vercel.app/");
        joinButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(email).doubleClick(email).sendKeys(Keys.BACK_SPACE).sendKeys("customer@demo.com").perform();
        actions.click(password).doubleClick(password).sendKeys(Keys.BACK_SPACE).sendKeys("demodemo").perform();
        loginButton.click();
        groceryButton.click();
        bakeryButton.click();
        sepeteEkleButonuBakery.click();
        cart.click();
        bakeryPlusButtonCart.click();
        bakeryMinusButtonCart.click();

    }



}
