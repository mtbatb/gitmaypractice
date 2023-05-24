package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import webpages.guruLoginpage;


public class Listerners_Demo {
	
	
	@Test	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
				
				
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		username.sendKeys("mngr476083");
		
		WebElement pasword=driver.findElement(By.xpath("//input[@name='password']"));
		pasword.sendKeys("ypamerU");
		
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();	
		
		
	}
	
	

}
