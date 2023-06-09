package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() throws InterruptedException {

        var editorPage = homePage.clickWysiwyg();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        Thread.sleep(3000);

        editorPage.increaseIndentation();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(),text1+text2,"Text from editor is Incorrect");


    }
}
