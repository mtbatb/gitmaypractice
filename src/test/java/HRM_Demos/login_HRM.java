package HRM_Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_HRM {
	
	@Test
	@Parameters({ "sUsername", "sPassword"})
	public void LoginHRM(String sUsername,String sPassword)
	{
		System.out.println("HRM_Login_Testcase");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys(sUsername);
		
		WebElement hrmPassword=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		hrmPassword.sendKeys(sPassword);
		
		WebElement loginBtn=driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBtn.click();
		
	}

}
