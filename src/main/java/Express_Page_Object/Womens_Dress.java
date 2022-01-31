package Express_Page_Object;

import Reusable_library.Reusable_Actions_Loggers_POM;
import Reusable_library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens_Dress extends Reusable_Annotations {


    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public Womens_Dress(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method



    //Click on Second Image
    @FindBy(xpath = "//*[@class='cdS1D9eKI7bXTMHp5xeAA']")
    WebElement Image;


    //Click on Pop Up
    @FindBy(xpath = "*[@name='bluecoreCloseButton']")
     WebElement PopUp;




//Click on Image
    public void Image(){
        Reusable_Actions_Loggers_POM.clickByIndex(driver,Image,1,logger,"Image");
    }//End of image




    public void ClickOnPopUp(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,PopUp,logger,"Click Pop Up");
    }//end of method










}
