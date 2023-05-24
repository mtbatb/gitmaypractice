package wyndhan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import webpages.wydhan_pom;

public class wyndhan_signup_testcase {
	
	@Test
	public void signup()
	{
		   System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe"); 
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.wyndhamhotels.com/en-uk");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //wydhan_pom wydhan=PageFactory.initElements(driver,wydhan_pom.class);
		   //wydhan.join_link.click();
		   
		   
	}

}
