package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {


    @Test
    public void testWaitUntilHidden() throws InterruptedException {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getloadedText(),"Hello World!","Loaded text is incorrect");
    }

    @Test
    public void testScrollToFifthParagraph(){

        homePage.clickInfiniteScroll().scrollToPatagraph(5);
    }
}
