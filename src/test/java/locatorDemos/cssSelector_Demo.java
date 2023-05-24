package locatorDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://ebay.com");
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
		//driver.findElement(By.cssSelector("#gh-btn")).click();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  
		WebElement email=driver.findElement(By.cssSelector("#ap_email")); 
		email.sendKeys("8801636401");
		  
		  WebElement continueBtn=driver.findElement(By.cssSelector(".a-button-input"));
		  continueBtn.click();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  WebElement pwd=driver.findElement
				  (By.cssSelector(".a-input-text a-span12 auth-autofocus auth-required-field"));
		 pwd.sendKeys("Twins0916&");
		
	}

}
