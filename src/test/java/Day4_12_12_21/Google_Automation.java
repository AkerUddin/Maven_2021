package Day4_12_12_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    public class Google_Automation {

        public static void main(String[] args) {

            //set the property of the chromedriver we are using
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            //define the web driver you are using
            WebDriver driver = new ChromeDriver();

            //simply open the google web site
            driver.navigate().to("https://www.google.com");

            //maximize my browser
            //driver.manage().window().fullscreen(); //for windows
            driver.manage().window().maximize();

            //close it
            //driver.close();


        }//end of main
    }  //end of Java class
