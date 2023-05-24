package xpathDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSignupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//username
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("sneha");
		
		//firstname
		WebElement firstName=driver.findElement(By.xpath("//input[@name=\"Username\"]//preceding::input[2]"));
		firstName.sendKeys("Selenium");
		
		

	}

}
