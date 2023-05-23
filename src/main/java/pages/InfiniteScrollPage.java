package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textblocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     * Scroll untill paragraph 4
     * @param index 1-based
     */

    public void scrollToPatagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsexecuter = (JavascriptExecutor)driver;

        while(getNumberofParagraphsPresent() < index){
            jsexecuter.executeScript(script);

        }


    }
    private int getNumberofParagraphsPresent(){
        return driver.findElements(textblocks).size();
    }




}
