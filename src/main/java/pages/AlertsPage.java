package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPrompt = By.xpath(".//button[text()='Click for JS Prompt']");

    private By results = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlert).click();
    }

    public void acceptAlert(){

        driver.switchTo().alert().accept();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirm).click();
    }


    public void acceptConfirm(){
        driver.switchTo().alert().accept();
    }

    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPrompt).click();
    }

    public void enterPrompt(String text){

        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }

}
