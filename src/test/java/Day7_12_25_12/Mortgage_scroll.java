package Day7_12_25_12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mortgage_scroll {
    public static void main(String[] args) throws InterruptedException {
        //webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //start maximized
        options.addArguments("start-maximized");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage cals
        driver.navigate().to("https://www.mortgagecalculator.org");
        //driver.manage().window().fullscreen();
        Thread.sleep(2500);
        //scroll to the windows of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by pixels
        jse.executeScript("scroll (0,450)");


    } //end of main
        
        
    }//end of java class
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

