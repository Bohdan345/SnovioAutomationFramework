import Pages.LoginPage;
import Pages.Prospects;
import org.junit.Assert;
import org.testng.annotations.Test;
import Сore.Driver.InitDriver;
import org.testng.*;

import static Сore.Driver.DataFromProperty.USER_LOGIN;
import static Сore.Driver.DataFromProperty.USER_PASSWORD;

public class loginPageTest {

    InitDriver driver = InitDriver.getInstance();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    Prospects prospectsPage = new Prospects(driver.getDriver());

    @Test(priority = 1)
    public void goToLoginPage() {
        String text = loginPage.getHeaderText();
        System.out.println("-" + text);
        Assert.assertEquals("Log In to your account", text);


    }


    @Test(priority = 2)
    public void logIn() {
        loginPage.login(USER_LOGIN, USER_PASSWORD);
        String text = prospectsPage.checkProspectPage();
        Assert.assertEquals("Lists", text);

    }

    @Test(priority = 3)
    public void importFromFile() {
        prospectsPage.importFormFile();
    }


}
