package Alekyapractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonScenario {
	
	public void LoginAmazon()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);   

				
		Actions actions=new Actions(driver);
				  
				  //menu xpath
				  
		WebElement menuLink=driver.findElement(By.xpath(
				  "//span[@id='nav-link-accountList-nav-line-1']"));
				  
		actions.moveToElement(menuLink).build().perform();
				  
		WebElement signInLinkButton=driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]/a")); 
		signInLinkButton.click();
		
		//Mobile/Email 
		
		WebElement email=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		email.sendKeys("8801636401");
		
		//continue Button
		WebElement continueBtn=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		continueBtn.click();
		//Password
		WebElement password=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		password.sendKeys("Yoga123$");
		
		//Sigin Button
		WebElement signInButton=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		signInButton.click();
		
		
		
		

	}

	@Test
	public void SearchProduct()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);   
		WebElement searchBox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchBox.sendKeys("LLYOD AC");
		searchBox.sendKeys(Keys.ENTER);

	}
}
