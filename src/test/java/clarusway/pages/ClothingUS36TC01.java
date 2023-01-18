package clarusway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ClothingUS36TC01 {
    private WebDriver driver;

    public ClothingUS36TC01(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Mango')]")
    private WebElement mangoDress;

    @FindBy(className = "h-5 w-5 text-accent")//sor svg den locata almak sağlıklı mı
    private WebElement favoriButton;

    @FindBy(id = "headlessui-menu-button-8")
    private WebElement profilAvatar;

    @FindBy(id = "headlessui-menu-item-135")
    private WebElement myWishlistsButton;

    @FindBy(partialLinkText = "Mango Self Striped A Line Dress")
    private WebElement wishListMangoDress;





}
