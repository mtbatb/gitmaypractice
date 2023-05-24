package TestNgdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class filpkartDemo {
	
	public static WebDriver driver=null;
	public static String url = "http://www.flipkart.com";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		
		
		Actions actions=new Actions(driver);

		Action action=actions.sendKeys(Keys.ESCAPE).build();
		action.perform();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement loginButton=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginButton.click();
		
		
		  WebElement  email_Id=driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
		  actions.moveToElement(email_Id).build().perform();
		  email_Id.sendKeys("8801636401");
		  
		  WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		  actions.moveToElement(password).build().perform();
		  password.sendKeys("Yoga123$");
		  
		  WebElement loginBtn=driver.findElement(By.xpath("//form[@autocomplete=\"on\"]/div[4]/button"));
		  actions.moveToElement(loginButton).build().perform();
		  loginBtn.click();
		  
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 WebElement searchBox=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		 searchBox.sendKeys("mobiles");
		 
		 Thread.sleep(5000);
		  
		  
		 
	}

}
