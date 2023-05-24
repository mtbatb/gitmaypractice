package mouseActions_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 

				
		Actions actions=new Actions(driver);				  
				  //menu xpath
				  
		WebElement menuLink=driver.findElement(By.xpath(
				  "//span[@id='nav-link-accountList-nav-line-1']"));
				  
		actions.moveToElement(menuLink).build().perform();
				  
		
		  WebElement signInButton=driver.findElement(By.xpath(
		  "//div[@id=\"nav-flyout-ya-signin\"]/a")); 
		  signInButton.click();
		  
		  WebElement userName=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		  userName.sendKeys("8801636401");
		 
		
				        
		   

	}

}
