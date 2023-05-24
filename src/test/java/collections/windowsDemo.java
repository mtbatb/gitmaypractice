package collections;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement clickHereLink=driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickHereLink.click();
		
		
		
		WebElement emailID=driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
		emailID.sendKeys("yogananadbheema@gmail.com");

	}

}
