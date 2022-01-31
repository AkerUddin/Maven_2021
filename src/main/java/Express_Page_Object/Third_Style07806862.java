package Express_Page_Object;

import Reusable_library.Reusable_Actions_Loggers_POM;
import Reusable_library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Third_Style07806862 extends Reusable_Annotations {


    //constructor is helper method that allows you to identify objects in your pom
    //so later you can class those methods in your test class
    //because your pom class is not static
    //declare a local logger to your pom class
    ExtentTest logger;
    public Third_Style07806862(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method



   // @FindBy(xpath = "//*[text()='Print a Label']")

    //Click on Specific Size
    @FindBy(xpath = "//*[text()='"+size+"']")
    WebElement SpecificSize;

    //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+size+"']",logger,"Size");


    //Click on Bag
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddToBag;

    //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to Bag");

    //Click on viewBag
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;
//Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"View Bag");




    public void size (String size) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO, "Clicking on element size");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+size+"']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on size " + e);
            logger.log(LogStatus.FAIL, "Unable to click on size. Error " + e);
            getscreenshot(driver, "size", logger);
        }//End of catch
    }//End of Size



    //click on  Bag
    public void ClickOnBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddToBag,logger,"Bag");
    }//end of method


    //click on ViewBag
    public void ClickOnViewBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View Bag");
    }//end of View Bag


}//end of class
