package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() throws InterruptedException {
        var uploadPage = homePage.clickFileUpload();
        Thread.sleep(3000);
        uploadPage.uploadFile("C:/Users/nagav/Downloads/sqlcheatsheet.jpg");
        Thread.sleep(3000);
        uploadPage.clickUpload();
        assertEquals(uploadPage.getUploadedFiles(),"sqlcheatsheet.jpg","Incorrect Match");

    }
}
