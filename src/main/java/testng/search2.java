package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search2 {

	public void testA(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("name='q']")).sendKeys("");
        List<org.openqa.selenium.WebElement>

            mylist=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']/span"));
        System.out.println(mylist.size());
        for (int i = 0; i < mylist.size(); i++) {

            System.out.println(mylist.get(i).getText());
            if (mylist.get(i).getText().contains("Selenium Benefits")) {
                mylist.get(i).click();
                break;
            }

        }
	}

}
