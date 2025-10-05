package testcases;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import pages.HomePage;

public class VerifyTableData extends BaseTest {

	HomePage homePage;

	@Test(groups = {"sanity"})
	public void verifyTableData() {

		homePage = new HomePage(driver);
		List<String> data = homePage.getTableData();

		List<String> expectedTableData = Arrays.asList("Kishore", "22", "Delhi", "Manish", "25", "Pune", "Praveen", "29",
				"Bangalore", "Dheepthi", "31", "Mumbai");

		verify.assertEquals(data, expectedTableData);
	}

}
