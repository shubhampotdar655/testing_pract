package TestScenarios;
import Objects.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class TestFN {
    WebDriver driver;
    GooglePage ob1;

    @BeforeTest
    public void beforetest(){
        //using webdriver manager
        WebDriverManager.chromedriver().setup();
        //using driver instance below
        driver= new ChromeDriver();
        //now before launching browser
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        // to launch URL
        driver.get("https://www.google.com/");
    }

    @Test
    public void SearchOperation() throws InterruptedException{
        //creating object for GOOGLEPAGE class (for now creating method level)
        GooglePage page=new GooglePage(driver);
        page.searchgoogle("Shubham potdar");
    }
    @Test
    public void AccessFacebook(){
        ob1=new GooglePage(driver);
        ob1.FacebookLink_Click();
    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }

}
