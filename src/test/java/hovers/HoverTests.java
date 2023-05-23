package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPAge = homePage.clickHovers();
        var caption = hoversPAge.hoverOverPicture(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"));


    }
}
