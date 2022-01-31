package Express_Page_Object;

import Reusable_library.Reusable_Actions_Loggers_POM;
import Reusable_library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Reusable_Annotations {

    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public Homepage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method



    //define all the WebElement we need for this page per use case
    //Hover on "Women" Tab
    @FindBy(xpath = "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]")
    WebElement HoverTab;
    // Reusable_Actions_Loggers.mouseHover(driver,"//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]


//click on dress link
    @FindBy(xpath = "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]")
    WebElement DressLink;

//@FindBy(xpath = "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')] ")
    // Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@href,'womens-clothing/dresses/cat550007')]"


////create a pom method

    public void HoverTab(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,HoverTab,logger,"HoverTab");
    }//end of clicking on HoverTab


    public void ClickOnDressLink(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,DressLink,logger,"DressLink");
    }//end of clicking Dresses














}
