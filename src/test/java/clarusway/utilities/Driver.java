package clarusway.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//Singleton Design Pattern is basically limiting our class so that whoever is using that class can only create 1 instance from that class. I create a private constructor which limits access to the instance of the class. Than I create a getter method where we specify how to create&use the instance. - I am using JAVA Encapsulation OOP
//Singleton tasarım deseni temel olarak sınıfımızı sınırlar, böylece bu sınıfı kullanan kişi o sınıftan sadece 1 örnek oluşturabilir. Sınıf örneğine erişimi sınırlayan özel bir yapıcı oluşturuyorum. Örneğin nasıl oluşturulacağını ve kullanılacağını belirttiğimiz bir Getter yöntemi oluşturuyorum. - Java kapsülleme oop konseptini kullanıyorum.
public class Driver {

    private static WebDriver driver;

    private Driver(){//Driver classının sadece 1 defa oluşturulmasını sağlayacak!!!

    }

    public static WebDriver getDriver(){



        if (driver==null){
            String browser=ConfigReader.getProperty("browser");

            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void closeDriver(){

        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }

}
