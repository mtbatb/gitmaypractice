package selenium_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBrowser {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		commonMethod();
		WebElement userId=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		userId.sendKeys("mngr406136");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("YzemuvE");
		
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		btnLogin.click();
	}
	
	public static void commonMethod()
	{
		System.setProperty("webdriver.chrome.driver","./mydrivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
	}

}
