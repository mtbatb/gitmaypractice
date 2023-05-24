package mouseActions_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver_folder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		//
		WebElement search_TextBox=driver.findElement(By.xpath("//input[@name='q']"));
		
		search_TextBox.sendKeys("citibank");
		
		search_TextBox.sendKeys(Keys.ENTER);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 Actions actions=new Actions(driver);
	
	       WebElement newSearch=driver.findElement(By.xpath("//div[@id='search']/div/div/div[6]/div/div/div[1]/div/a"));
	
	       actions.contextClick(newSearch).build().perform();

	}

}
