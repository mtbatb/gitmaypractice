package selenium_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutusingSendKeysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/*
		 * WebElement userName = driver.findElement(By.xpath("//input[@name='uid']"));
		 * userName.sendKeys("mngr453044");
		 */
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementByName('uid').value='mngr453044'");
	}

}
