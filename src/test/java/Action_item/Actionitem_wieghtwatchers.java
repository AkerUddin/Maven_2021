package Action_item;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Actionitem_wieghtwatchers {
    public static void main(String[] args) throws InterruptedException {



        ArrayList<String> Zipcode = new ArrayList<>();
        Zipcode.add("14225");
        Zipcode.add("14228");
        Zipcode.add("14227");

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//define the web driver you are using

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");

        options.addArguments("incognito");

        //define the webdriver you are using

        WebDriver driver = new ChromeDriver(options);


        for (int i = 0; i < Zipcode.size(); i++) {




            driver.navigate().to("https://www.WeightWatchers.com");
            // driver.manage().window().fullscreen();
            Thread.sleep(2500);

            try {
                driver.findElement(By.xpath("//*[@class='Icon_icon__wrapper__3dIsp']")).click();

            } catch (Exception e) {
                System.out.println("unable to click Attend dropdown " + e);
            }//end of Attend exception


            try {
                driver.findElement(By.xpath("//*[@data-e2e-name= 'unlimited_workshops']")).click();
            } catch (Exception e) {
                System.out.println("unable to click workshops " + e);
            }//end of Workshop exception

            Thread.sleep(1500);


            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on studios " + e);
            }//end of studios exception


            try {

                WebElement click = driver.findElement(By.xpath("//*[@placeholder='Enter location']"));
                click.clear();
                click.sendKeys(Zipcode.get(i));
            } catch (Exception e) {
                System.out.println("unable to type zipcodes");
            }//end of zipcode exception


            try {
                driver.findElement(By.xpath("//*[@aria-label='Submit']")).click();
            } catch (Exception e) {
                System.out.println("unable to search " + e);
            }//end of search exception



            //wait for new page
            Thread.sleep(4000);

            //conditional for iteration
            try {
                List<WebElement> studio = driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']"));

                if (i == 0) {
                    studio.get(1).click();
                }
              else  if (i == 1) {
                    studio.get(2).click();
                }
              else  if (i == 2) {
                    studio.get(0).click();
                }
            } catch (Exception e) {
                System.out.println("unable to select studio" + e);

            }//end of if

            Thread.sleep(2500);



            try {
                String result = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("My studio address  " + Zipcode.get(i) + " is " + result);

            }catch (Exception e){
                System.out.println("Unable to capture the address " +e);
            }//End of try



            //Scroll to the studio hours
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            //Scroll to the view by pixels
            jse.executeScript("scroll(0,450)");

            Thread.sleep(2000);







            try {
                driver.findElement(By.xpath("//*[text()='Business hours']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on business hours" +e);
            }//End of try
            Thread.sleep(2000);





            try {
                String Schedule = driver.findElement(By.xpath("//*[@class='hoursWrapper-1KHIv show-1db4o']")).getText();
                System.out.println("The schedule timings for " + Zipcode.get(i) + " is " + Schedule);
            }catch (Exception e){
                System.out.println("Unable to capture schedule " + e);
            }//end of hours statement



            }//end of for loop
            //driver.quit();

        }//end of main
    }//end of java




