package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrolltoTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}
