package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalslider() throws InterruptedException {
        String value = "4";

        var horizontalsliderPage = homePage.clickHorizontalSlider();
        horizontalsliderPage.setSliderValue(value);
        Thread.sleep(3000);
        assertEquals(horizontalsliderPage.getSliderValue(),value,"Slider value is incorrect");

    }
}
