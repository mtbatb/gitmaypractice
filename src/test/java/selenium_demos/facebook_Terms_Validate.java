package selenium_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class facebook_Terms_Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe"); 
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   WebElement Terms_Link=driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
		   Terms_Link.click();
		   String actualTitle=driver.getTitle();
		   System.out.println(actualTitle);
		   String expectedTitle = "Yahoo";
		   Assert.assertEquals(actualTitle, expectedTitle);
		   

	}

}
