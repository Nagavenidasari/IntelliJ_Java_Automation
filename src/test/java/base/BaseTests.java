package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import java.time.Duration;
import java.util.List;


public class BaseTests {

    //private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new EventFiringWebDriver((new ChromeDriver(getChromeOptions())));
        driver.register(new EventReporter());
        //driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        goHome();
       // setCookie();
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera= (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {

                Files.move(screenshot,new File("C:/Users/nagav/IdeaProjects/IntelliJ_JavamavenAutomaiton/src/main/resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //System.out.println("Screenshot taken: "+screenshot.getAbsolutePath());

    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("https://the-internet.herokuapp.com/")
                .build();
        driver.manage().addCookie(cookie);
    }



    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
