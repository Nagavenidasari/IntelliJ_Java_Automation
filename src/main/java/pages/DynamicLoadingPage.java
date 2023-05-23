package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_example1 = By.xpath("//*[@id=\"content\"]/div/a[1]");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExamplePage clickExample1() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(link_example1).click();
        return new DynamicLoadingExamplePage(driver);

    }
}
