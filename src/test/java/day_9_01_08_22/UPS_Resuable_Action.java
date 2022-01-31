package day_9_01_08_22;

import org.openqa.selenium.WebDriver;

public class UPS_Resuable_Action {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = Reusable_Action.setDriver();


        //navigate to ups
        driver.navigate().to("https://www.ups.com/us");
        driver.manage().window().maximize();

        Thread.sleep(3000);


//click on Track
        Reusable_Action.clickMethod(driver, "//*[text()='Tracking')", "Track");
        //click on track a package
        Reusable_Action.clickMethod(driver, "//*[text()='Track a Package']", "Track a Package");
        Thread.sleep(1500);


        //enter any tracking number
        Reusable_Action.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","1111111111111","Enter Tracking");

        //click on Track button
        Reusable_Action.clickMethod(driver,"//*[@id='stApp_btnTrack']","Track Button");

        Thread.sleep(1500);

        //capture the error message and print out only 'We could not locate the shipment'
        String resultValue = Reusable_Action.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");
        //declare array and split
        String[] arrayResult = resultValue.split("details");
        System.out.println("My error info is " + arrayResult[0]);



Thread.sleep(1500);


    }
}
