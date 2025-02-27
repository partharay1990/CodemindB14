package seleniumpractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforeTestPlan() {

		System.out.println("Before test plan");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeTestCase() {

		System.out.println("Before test case");

	}

	@Test
	public void testCase() {

		System.out.println("Test Case");
	}

	@AfterMethod
	public void afterTestCase() {

		System.out.println("after test case");

	}

	@AfterClass
	public void afterClass() {

		System.out.println("after class");
	}

	@AfterTest
	public void afterTestPlan() {

		System.out.println("after test plan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

}
