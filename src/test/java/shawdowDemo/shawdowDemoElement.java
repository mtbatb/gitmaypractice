package shawdowDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shawdowDemoElement {
	
	@Test
	public void ShawdowDemo()
	{
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://qa.frost.2u.com/auth/#/login/Nar12");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//WebElement username=(WebElement)jse.executeScript("return document.querySelector('lm-identity-login').shadowRoot.querySelector('div> main> div > div >div >form > div > input#username')");
																  //document.querySelector('lm-identity-login').shadowRoot.querySelector('div> main >div >div>div>form>div>input#username')
		//<input id=​"username" type=​"text" name=​"username" placeholder=​"Username/​Email" required autofocus autocomplete=​"on" class=​"form-control ng-pristine ng-invalid ng-touched">​
		//String js="arguments[0].setAttribute('value','Test')";
		
		//((JavascriptExecutor)driver).executeScript(js,username);
		
		WebElement username=(WebElement) By.cssSelector("lm-identity-login");
		username.sendKeys("test");
	}

}
