package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class ClothingUS36TC02 {
    private WebDriver driver;

    public ClothingUS36TC02() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@role='button'])[8]")
    private WebElement redColor;

    @FindBy(xpath = "(//div[@role='button'])[9]")
    private WebElement blueColor;

    @FindBy(xpath = "(//div[@role='button'])[10]")
    private WebElement sSize;

    @FindBy(xpath = "(//div[@role='button'])[11]")
    private WebElement mSize;

    @FindBy(xpath = "(//div[@role='button'])[12]")
    private WebElement lSize;

    //US36TC03->yine mango dress e tıklat,2.ürün

    @FindBy(xpath = "//span[text()='Categories']")
    private WebElement categoriesText;

    @FindBy(xpath = "//button[text()='Women Dress']")
    private WebElement category1;

    @FindBy(xpath = "//button[text()='Single Color']")
    private WebElement category2;

    //US36TC04--> locateler aynı ürün ve category locateleri olacak-> assert de url den yapılacak!!!

    //US36TC05

    @FindBy(xpath = "(//h1)[2]")
    private WebElement productLink;//url den contains mango diyip Assert edilir

    //US37TC01

    @FindBy(xpath = "//h3[contains(text(),'Notch Lapel Elastic')]")
    private WebElement sayfadakiSecilenUrun;

    @FindBy(xpath = "(//span[text()='plus'])[9]")
    private WebElement plusButton;

    @FindBy(id = "nr-ext-rsicon")
    private WebElement cart;//iframe

    @FindBy(className = "font-bold text-heading")
    private WebElement seppettekiUrun;

    //US37TC02

    //***********TC01 deki aynı urun tıklanır******
    @FindBy(xpath = "span[text()='pieces available']")
    private WebElement urunStokSayısı;

    //US37TC03->sayfada seciken ürüne stok sayısınca tıklar


    //US37TC04

    @FindBy(xpath = "(//span[text()='minus'])[2]")
    private WebElement minusButtonCart;
    @FindBy(xpath = "(//span[text()='plus'])[14]")
    private WebElement plusButtonCart;
    @FindBy(xpath = "(//span[text()='close'])[2]")
    private WebElement closeButtonCart;

    //US37TC05

    @FindBy(className = "my-2.5 font-semibold text-accent")
    private WebElement sepettekiUrunBirimFiyati;

    @FindBy(className = "font-bold text-heading ltr:ml-auto rtl:mr-auto")
    private WebElement sepettekiUrunToplamFiyati;

//*****************************************************

    //US38TC06

    @FindBy(partialLinkText = "Offers")
    private WebElement offersButonu;

    @FindBy(xpath = "(//span[text()='Copy'])[4]")
    private WebElement couponHello15;
    @FindBy(xpath = "//*[text()='Checkout']")
    private WebElement checkoutButton;
    @FindBy(xpath = "//*[text()='Check Availability']")
    private WebElement checkAvailabilityButonu;
    @FindBy(xpath = "//p[@role='button']")
    private WebElement couponButton;

    //@FindBy(id = "code")
    //private WebElement kuponYapisacakAlan();

    @FindBy(xpath ="//*[text()='Apply']")
    private WebElement applyButton;
    @FindBy(xpath = "//p[text()='Discount']")
    private WebElement discountText;

    @FindBy(xpath = "//span[@class='text-base font-semibold text-heading']")
    private WebElement toplamUrunFiyati;

    //US38TC7

    @FindBy(id = "headlessui-label-62")
    private WebElement odemeYontemiText;
    @FindBy(id = "headlessui-radiogroup-option-63")
    private WebElement stripeButonu;
    @FindBy(id = "headlessui-radiogroup-option-64")
    private WebElement cashOnDeliveryButonu;

    //US38TC8

    @FindBy(xpath = "//button[.='Place Order']")
    private WebElement placeOrderButonu;//assert u url den yap

    //US38TC09
    @FindBy(partialLinkText = "Notch Lapel Elastic Waist Plain Trench Coat")
    private WebElement siparisSayfasıindakiUrun;

    @FindBy(xpath = "//p[.='$4,995.00']")
    private WebElement siparisSayfasıindakiUrunFiyati;

    //US38TC10

    @FindBy(xpath = "//span[.='Order Status :']")
    private WebElement siparisDurumu;

    //US38TC11

    @FindBy(className = "rounded border border-border-200 py-4 px-5 shadow-sm")
    private List<WebElement> odemeBilgileri;















    @Test
    public void test() {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("h-full w-screen max-w-md")));
        plusButtonCart.click();
    }
}
