package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginbtn = By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String usrname){
        driver.findElement(username).sendKeys(usrname);
    }

    public void setPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginbtn).click();
        return new SecureAreaPage(driver);
    }
}
