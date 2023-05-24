package xpathDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers_Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateacco"
				+ "unt?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement email_test=driver.findElement
				(By.xpath("//input[@name='firstName']//following::input[4]"));
		email_test.sendKeys("yoganand.bheema@gmail.com");
	}

}
