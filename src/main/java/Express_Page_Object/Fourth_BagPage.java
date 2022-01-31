package Express_Page_Object;

import Reusable_library.Reusable_Actions_Loggers;
import Reusable_library.Reusable_Actions_Loggers_POM;
import Reusable_library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth_BagPage extends Reusable_Annotations {



    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public Fourth_BagPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


//            @FindBy(xpath = "//*[text()='Print a Label']")


    //understand where did this inspection come from

    @FindBy(xpath = "//*[@class='dropdown__select _3sadDDi3 inputInactive Sx8uIkYS']")
    WebElement quantity;

    //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+quantity+"']",logger,"quantity");


    //Click on Check Out
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement CheckOut;
     //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"click on checkout");



    //Click on checkout as guest
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckOutAsGuest;

    //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"check out as guest");




    //create a pom method to get the link count for the list
    public void SelectQuantity(String userData){
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver,quantity,userData,logger,"Quantity");
    }//End of Select


    ///Select A quantity
   // public void SelectOnQuantity(){
       // Reusable_Actions_Loggers_POM.clickMethod(driver,Fourth_BagPage,userdate,logger,"Fourth_BagPage");
   // }//end of method



   // public void SelectOnQuantity(String userData){
     //   Reusable_Actions_Loggers_POM.selectByVisibleText(driver,Quantity,userData,logger,"Quantity");
    //}//End of Select


    //Click on Check Out
    public void ClickOnCheckOut(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOut,logger,"CheckOut");
    }//end of method


    //Click on checkout as guest
    public void ClickOnCheckOutAsGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOutAsGuest,logger,"CheckOutAsGuest");
    }//end of method






}
