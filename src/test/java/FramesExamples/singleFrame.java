package FramesExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class singleFrame {
	
	public WebDriver driver=null;
	@Test
	public void swithtoFrameDemo()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver_109.exe");
		 driver=new ChromeDriver();		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");   	  
   	  	driver.manage().window().maximize();
   	  	
   	  	Actions actions=new Actions(driver);
   	  	//swithing to the iframe
   	  	driver.switchTo().frame("globalSqa");
   	  	
   	  	WebElement automationlink=driver.findElement(By.xpath("//div[@id=\"portfolio_items\"]/div[1]/a"));
   	  	automationlink.click();
	}

}
