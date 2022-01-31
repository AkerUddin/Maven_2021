package Express_Page_Object;

import Reusable_library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


    public class BaseClass_1 extends Reusable_Annotations {
        public BaseClass_1(WebDriver driver){
            PageFactory.initElements(driver,this);
        }//end of constructor class


        //create static reference for Express home page
        public static Homepage homepage(){
            Homepage homepage = new Homepage(driver);
            return  homepage;
        }//

        //Create static for Women Dresses
        public static Womens_Dress womens_dress(){
            Womens_Dress womens_dress = new Womens_Dress(driver);
            return womens_dress();
        }//






        //Create static for thirdpage
        public static Third_Style07806862 third_style07806862(){
            Third_Style07806862 third_style07806862 = new Third_Style07806862(driver);
            return third_style07806862;


        //Create static for fourth page/quantity
        public static Fourth_BagPage fourthBagPage(){
            Fourth_BagPage fourth_bagPage = new Fourth_BagPage(driver);
                return fourth_bagPage;

            }


        //Create static for Check oUt page
        public static CheckOutPage checkOutPage(){
            CheckOutPage checkOutPage1 = new CheckOutPage(driver);
            return checkOutPage;
        }//


    }//End of Class


}
