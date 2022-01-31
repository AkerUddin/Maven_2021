package Action_item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_DynamicArray_forloops {

        public static void main(String[] args) throws InterruptedException {
            //Make a Dynamic Array with ForLoop

            String[] sports = new String[6];
            sports[0] = "Soccer";
            sports[1] = "Racing";
            sports[2] = "Football";
            sports[3] = "Handball";
            sports[4] = "UFC";
            sports[5] = "Golf";

//set the property of the chromedriver we are using
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//define the web driver you are using

            ChromeOptions options = new ChromeOptions();

            options.addArguments("start-maximized");

            options.addArguments("incognito");

            //define the webdriver you are using

            WebDriver driver = new ChromeDriver(options);


            for (int i =0; i < sports.length;i++){

                //simply open the google web site
                driver.navigate().to("https://www.bing.com");

                //maximize my browser
                driver.manage().window().fullscreen();

                //anytime when you go to a new page you should put some wait statement
                Thread.sleep(2000);


                //searching for sports on bing search field
                driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys(sports[i]);

                //hit submit on bing search button
                driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();

                //Another wait statement since we came to a new page(result page

                Thread.sleep(2000);

                //Another wait statement since we came to a new page(result page)
                Thread.sleep(2000);



                //Capture the search result and store it as a variable
                String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
                //Declaring the array variable to split the result
                String[] arrayResult = result.split(" ");
                //Now print the search number only
                System.out.println("My search number for sports " + sports[i] + " is " + arrayResult[0]);

                //  driver.quit();
            }//End of for loop

            //driver.quit()
        }// end of main
}//end of java class
