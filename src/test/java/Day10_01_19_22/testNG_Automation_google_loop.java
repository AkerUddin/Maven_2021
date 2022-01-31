package Day10_01_19_22;

import day_9_01_08_22.Reusable_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class testNG_Automation_google_loop {


    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Action.setDriver();
    }//end of precondition

    @Test
    public void googleSearchLoop(){
        ArrayList<String > cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for(int i = 0; i < cars.size(); i++){
            //navigating to google
            driver.navigate().to("https://www.google.com");
            //entering a unique keyword from array list
            Reusable_Action.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");







        }//end of loop


    }//end of test

    @AfterSuite
    public void endSession(){
        driver.quit();
    }











}
