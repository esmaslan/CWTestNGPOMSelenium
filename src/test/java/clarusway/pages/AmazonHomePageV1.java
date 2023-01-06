package clarusway.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePageV1 {

    private WebDriver ldriver;//local driver

    public AmazonHomePageV1(WebDriver ldriver) {
        this.ldriver = ldriver;

        PageFactory.initElements(ldriver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement txtSearch;

    @FindBy(id = "nav-link-accountList")
    private WebElement accountAndList;

    @FindBy(id = "nav-orders")
    private WebElement orders;


    public void searchFor(String key) {
        txtSearch.sendKeys(key + Keys.ENTER);
    }

    public void navigateToOrders() {
        Actions actions = new Actions(ldriver);

        actions.moveToElement(accountAndList).perform();

        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(orders)).click();

    }

}
