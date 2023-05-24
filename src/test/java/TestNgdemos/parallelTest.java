package TestNgdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {

	// single class->multiple methods-->multiple browsers
	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		// Initializing the firefox driver (Gecko)

		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.gecko.driver","./driver_folder/geckodriver.exe");
		System.out.println("Initilizing the Firefox  Driver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/v4/index.php");
		LoginCode();
		// driver.close();
	}

	@Test
	public void ChromeTest() {
		WebDriverManager.chromedriver().setup();
		System.out.println("hi...");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HRMLoginCode();
		// driver.close();
	}

	public void LoginCode() {
		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		username.sendKeys("mngr406136");

		WebElement pasword = driver.findElement(By.xpath("//input[@name='password']"));
		pasword.sendKeys("YzemuvE");

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginBtn.click();
	}

	public void HRMLoginCode() {
		WebElement userId = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		userId.clear();
		userId.sendKeys("Admin");

		WebElement pasword = driver.findElement(By.xpath("//input[@name='password']"));
		pasword.sendKeys("admin123");

		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();
	}
}
