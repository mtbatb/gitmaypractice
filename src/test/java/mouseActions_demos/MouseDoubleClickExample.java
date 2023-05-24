package mouseActions_demos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseDoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    	
   		 Actions action = new Actions(driver);
   		WebElement newSearch=driver.findElement(By.xpath("//div[@id=\"search\"]/div/"
	       		+ "div/div[1]/div/div/div/div/div/div/div/div[1]/a"));
	
	    action.doubleClick(newSearch).build().perform();

	}

}
