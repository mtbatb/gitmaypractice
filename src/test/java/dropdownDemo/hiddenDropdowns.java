package dropdownDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenDropdowns {

	@Test
	public void handleHiddenDropdown()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.flipkart.com/");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		/*
		 * WebElement userId=driver.findElement(By.className("_2IX_2- VJZDxU"));
		 * userId.sendKeys("8801636401");
		 */
		/*
		 * WebElement searchTxt=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		 * searchTxt.sendKeys("mackbook");
		 * 
		 * WebElement macbookairm1=driver.findElement(By.
		 * xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]/li[5]/div/a"));
		 * macbookairm1.click();
		 */	}
}
