package listenerDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class listenerTestNG implements ITestListener {
		 
		 @Test
		 public void onTestStart(ITestResult result) {
		 
		 System.out.println("HRM New Test Started" +result.getName());
		 
		 }
		 @Test
		 public void onTestSuccess(ITestResult result) {
		 
		 System.out.println("Test Successfully Finished" +result.getName());
		 
		 }
		 @Test
		 public void onTestFailure(ITestResult result) {
		 
		 System.out.println("Test Failed" +result.getName());
		 
		 }
		 @Test
		 public void onTestSkipped(ITestResult result) {
		 
		 System.out.println("Test Skipped" +result.getName());
		 
		 }
		 

}
