package TestNgdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.guruLoginpage;


public class loginTestng_parameter {
		
	@Test
	@Parameters({ "sUsername", "sPassword"})
	public void login(String sUsername,String sPassword)
	{
		//System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
				
		String userNameData=sUsername;
		System.out.println(userNameData);
		String passwordData=sPassword;
		System.out.println(passwordData);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		username.sendKeys(userNameData);
		
		WebElement pasword=driver.findElement(By.xpath("//input[@name='password']"));
		pasword.sendKeys(passwordData);
		
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();	
		
		
	}
	
	

}
