package selenium_demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.demo.guru99.com/v4/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement userId=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		userId.sendKeys("mngr406136");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("YzemuvE");
		
		
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(loginBtn));

		element.click();
		
		//driver.close();		
		

	}

}
