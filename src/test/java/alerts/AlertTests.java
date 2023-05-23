package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){

       var alertsPage= homePage.clickAlerts();
       alertsPage.triggerAlert();
       alertsPage.acceptAlert();
       assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testAcceptConfirm(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();
        alertsPage.acceptConfirm();
        assertEquals(alertsPage.getResult(),"You clicked: Ok");
    }

    @Test
    public void testDismissConfirm(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();
        alertsPage.dismissConfirm();
        assertEquals(alertsPage.getResult(),"You clicked: Cancel");
    }

    @Test
    public void testEnterPrompt(){

        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerPrompt();
        alertsPage.enterPrompt("abcdef");
        assertEquals(alertsPage.getResult(),"You entered: abcdef");
    }


}
