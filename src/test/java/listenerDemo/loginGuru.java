package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginGuru {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		/*
		 * String userNameData=sUsername; System.out.println(userNameData); String
		 * passwordData=sPassword; System.out.println(passwordData);
		 */
		
		//Pageobject model(POM)-->Page Factory using 
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='uid']"));
		userName.sendKeys("mngr476083");
		WebElement passwrd=driver.findElement(By.xpath("//input[@name='password']"));		
		passwrd.sendKeys("ypamerU");
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();

	}

}
