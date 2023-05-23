package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin() throws InterruptedException {
        LoginPage loginPage= homePage.clickFormAuthentication();
        Thread.sleep(2000);
        loginPage.setUsername("tomsmith");
        Thread.sleep(2000);
        loginPage.setPassword("SuperSecretPassword!");
        Thread.sleep(2000);
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        Thread.sleep(2000);
        System.out.println(secureAreaPage.getAlertText());
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");

    }
}
