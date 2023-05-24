package TestNgdemos;

import org.testng.annotations.Test;

public class TestPriority {
	// alphabetic order
	// -4,-3,-2,-1,0,1,2,3,4-->Manager Dell

	// A//-4,-3,-2,-1,0,1,2,3,4 --A --Correct....
	// B//-1,-2,-3,-4,0,1,2,3,4-->
	// C//0,1,2,3,4,-4,-3,-2,-1--> C-10mts.......
	// D//0,1,2,3,4,-1,-2,-3,-4

	@Test(priority = 3)
	public void TestCaseTwo()

	{
		System.out.println("priority=3 : TestCaseTwo");
	}

	@Test(priority = 2)
	public void TestCaseThree() {
		System.out.println("priority=2 TestCaseThree");

	}

	@Test(priority = 0)
	public void TestCaseFour() {
		System.out.println("priority=0 TestCaseFour excute");
	}

	@Test(priority = 1)
	public void TestCaseFive() {
		System.out.println("priority=1 TestCaseFive");
	}

	@Test(priority = -1)
	public void TestCaseSelenium() {
		System.out.println("priority=-1 TestCaseSelenium");
	}

	@Test(priority = -2)
	public void TestCaseSeven() {
		System.out.println("priority=-2 TestCaseSeven");
	}

	@Test(priority = -3)
	public void TestCaseEight() {
		System.out.println("priority=-3 TestCaseEight");
	}

	@Test(priority = -4)
	public void AdminTestCase() {
		System.out.println("priority=-4 AdminTestCase");
	}

}
