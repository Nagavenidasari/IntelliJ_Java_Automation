package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    // constructor initializing the driver
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){

        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){

        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileuploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileuploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwyg(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }



    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }




}
