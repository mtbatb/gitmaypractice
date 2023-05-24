package TestNgdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_GroupDemo {
	
	String message = ".com";
	  @Test(groups = { "smokecases" })	   
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      String message = ".com";
	      Assert.assertEquals(message, ".com");
	   }
	   @Test(groups = { "smokecases" })	   
	   public void testPrintMessage1() {
	      System.out.println("Inside testPrintMessage()");
	      String message = ".com";
	      Assert.assertEquals(message, ".com");
	   }
	   @Test(groups = { "smokecases" })	
	   public void smoketestcase2()
	   {
		   System.out.println("smoketestcases");
	   }
	   
	   @Test(groups = { "smokecases" })	
	   public void smoketestcase3()
	   {
		   System.out.println("smoketestcases-3");
	   }


	   @Test(groups = { "groupchecktest" })	   
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      String message = ".dcom";
	      Assert.assertEquals(message,".com");
	   }
	   
	   @Test(groups = { "functest" })	   
	   public void testingExitMessage() {
	      System.out.println("Inside testExitMessage()");
	      String message = "www." + "tutorialspoint"+".com";
	      Assert.assertEquals(message, ".com");
	   }
	  
	   @Test(groups = {"Regression"})
	   public void testGroup1()
	   {
		   System.out.println("testcase of testGroup1");
	   }
	   
	   @Test(groups = {"Regression"})
	   public void testGroup2()
	   {
		   System.out.println("testcase of testGroup2");
	   }
	@Test(groups = {"Regression"})
	   public void testGroup3()
	   {
		   System.out.println("testcase of testGroup3");
	   }
	
	 @Test(groups= {"CR cases"})
	   public void testGroup4()
	   {
		   System.out.println("testcase of testGroup3");
	   }
	 
	 @Test(groups= {"Jyothi cases"})
	   public void testGroup_jyothi()
	   {
		   System.out.println("testcase of testGroup_jyothi");
	   }

}
