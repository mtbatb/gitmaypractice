package TestNgdemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnot1 {
	
	@BeforeSuite
	  public void BeforeSuitemethod()
	  {
		  System.out.println("BeforeSuite");
	  }
	  @AfterSuite
	  public void AfterSuitemethod()
	  {
		  System.out.println("After-Suite");
	  }
	  
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	      //amazon login code
	   }
	   
	   @Test
	   public void testCase5() {
	      System.out.println("in test case 5");
	      //amazon login code
	   }
	   
	   @Test
	   public void Testcase4()
	   {
		   System.out.println("VTestcase4");
	   }

	   // test case 2
	   
	  
	  
	   @BeforeMethod//annotations
	   public void beforeMethod() {
		   
	      System.out.println("in beforeMethod");
	   }
	   
	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

		
}
