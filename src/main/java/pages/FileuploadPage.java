package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileuploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedfiles = By.id("uploaded-files");

    public FileuploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void uploadFile(String absolutePath){

        driver.findElement(inputField).sendKeys(absolutePath);

    }
    public void clickUpload(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedfiles).getText();
    }
}
