package keypresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class KeyPressesTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");

    }

    @Test
    public void testPie() throws InterruptedException {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPie();
        Thread.sleep(2000);


    }
}
