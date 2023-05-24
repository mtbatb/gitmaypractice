package selenium_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver1=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement userId=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		userId.sendKeys("mngr406136");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("YzemuvE");
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		loginBtn.click();
		
		driver.close();		
		
		
	}

}
