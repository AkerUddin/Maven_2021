package day12_01_25_22;

import day_9_01_08_22.Reusable_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebelement_USPS {


    WebDriver driver;
    //your extentreport and extenttest command should be declared outside so it can be reusable among all annotations

    @BeforeSuite
    public void setTheDriver(){driver = Reusable_Action.setDriver(); }// end of precondtion



    @Test
    public void uspsTest(){
        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //using day_9_010822.explicit wait to get the count of elements within same class group
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            List<WebElement> uspsTabs = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            System.out.println("My Nav list count is " + uspsTabs.size());
        } catch (Exception e) {
            System.out.println("unable to locate links " + e);
        }

    }//end of test

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }




}
