package ORM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import webpages.guruLoginpage;
public class HRM_ORM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		Properties obj = new Properties();
		FileInputStream objfile = null;
		try {
			objfile = new FileInputStream
					(System.getProperty("user.dir")
							+"\\myFiles\\myfile.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			obj.load(objfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String drivers_path=obj.getProperty("Driver_Folder_Path");
		System.out.println(drivers_path);
		
		String driver_Type=obj.getProperty("driver_Type");
		System.out.println(driver_Type);
		
		String ORM_URL=obj.getProperty("ORM_URL");
		System.out.println(ORM_URL);
		
		System.setProperty(driver_Type,drivers_path);
		WebDriver driver=new ChromeDriver();
		driver.get(ORM_URL);
		driver.manage().window().maximize();
		
		
		
		
				
	}

}
