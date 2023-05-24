package selenium_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import webpages.amazon;
import webpages.guruLoginpage;


public class pageObjectDemo {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//page factory model
		guruLoginpage webpages=PageFactory.initElements(driver, guruLoginpage.class);
		//testdata==excel,object properities....
		webpages.username.sendKeys("mngr406136");
		webpages.userpwd.sendKeys("YzemuvE");
		webpages.loginBtn.click();
		//webpages.HelpLink.click();
		//webpages.userPath.click();
		
		//10 pages==>10 class file -->only xpath information...

	}

}
