package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExamplePage {

    private WebDriver driver;
    private By start_button = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingExamplePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(start_button).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        FluentWait fwait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fwait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }

    public String getloadedText(){
        return driver.findElement(loadedText).getText();
    }
}
