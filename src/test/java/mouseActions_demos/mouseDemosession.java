package mouseActions_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDemosession {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commonMethod();
		Actions actions=new Actions(driver);
		
		//Menu Link xpath
		WebElement menuLink=driver.findElement(By.xpath("//div[@id=\"nav-tools\"]/a[2]/div/span"));
		actions.moveToElement(menuLink).build().perform();
		
		WebElement subMenuLink=driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]/a"));
		subMenuLink.click();
		
	}
	
	public static void commonMethod()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   

	}

}
