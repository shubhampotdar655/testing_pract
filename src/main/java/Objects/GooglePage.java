package Objects;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class GooglePage {
    //launch webdriver instance
    WebDriver driver;

    //constructor is to be created..it is called when instance of a class is created
    public GooglePage(WebDriver driver){  //passing in parameter to point the webdriver whenever i am calling
        //and to map my webdriver to this obejcts location use

        this.driver=driver;
    //above is the precondition
    }
    By searchbox= By.xpath("//input[@name='q']");
    By Search_btn= By.xpath("(//input[@name='btnK'])[1]");
    By Facebook_Link= By.xpath("//a//h3[text()='Facebook - Log In or Sign Up']");


    //create a method for search
    public void searchgoogle(String Searchinput){
        try{
            driver.findElement(searchbox).sendKeys(Searchinput);
            Thread.sleep(1000);
            driver.findElement(Search_btn).click();
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }

    }
    public void FacebookLink_Click(){
        try{
            Thread.sleep(2000);
            System.out.println("before click");
            driver.findElement(Facebook_Link).click();
            System.out.println("After click");
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
