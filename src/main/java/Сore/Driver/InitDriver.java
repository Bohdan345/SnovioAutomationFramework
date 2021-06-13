package Сore.Driver;

import Pages.LoginPage;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Сore.Driver.DataFromProperty.BROWSER;
import static Сore.Driver.DataFromProperty.URL;

public class InitDriver {

    private static WebDriver driver = null;
    private static InitDriver initDriverInstance = null;




    private InitDriver() {

        driver = Browsers.getBrowser(BROWSER);
        if (driver != null) {
            driver.navigate().to(URL);

        }
    }




    public static InitDriver getInstance() {
        if (initDriverInstance == null) {
            initDriverInstance = new InitDriver();
        }
        return initDriverInstance;
    }

    public WebDriver getDriver() {
        return driver;
    }

     public void closeDriver() {
        driver.quit();
        driver.close();
    }

}
