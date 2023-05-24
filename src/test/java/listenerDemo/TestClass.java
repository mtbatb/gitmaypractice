package listenerDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	public WebDriver driver;
	
	@Test
	public void TestLogin()
	{
		
		System.out.println("Login");
	}
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void startReport() {
	         // Create an object of Extent Reports
	extent = new ExtentReports();
	 
	spark = new ExtentSparkReporter(System.getProperty("user.dir") 
			+ "/test-output/STMExtentReport.html");
	extent.attachReporter(spark);
	extent.setSystemInfo("Host Name", "Yoganand");
	         extent.setSystemInfo("Environment", "Production");
	extent.setSystemInfo("User Name", "Yoganand");
	spark.config().setDocumentTitle("QA Status Report ");
	                // Name of the report
	spark.config().setReportName("Daily Report");
	                // Dark Theme
	spark.config().setTheme(Theme.STANDARD);
	}
	
	//This method is to capture the screenshot and return the path of the screenshot.
	public static String getScreenShot(WebDriver driver,
			String screenshotName) throws IOException 
	{
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	// after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
	}
	@BeforeMethod
	public void setup() {
		
		
	//System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	}
	@Test
	public void verifyTitle() {
	logger = extent.createTest("To verify Google Title");
	Assert.assertEquals(driver.getTitle(),"Google");
	}

}
