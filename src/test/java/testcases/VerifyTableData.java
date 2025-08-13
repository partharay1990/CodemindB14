package testcases;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import pages.HomePages;

public class VerifyTableData extends BaseTest {

	HomePages homepage;

	@Test(groups = { "sanity" })
	public void verifyTableData() {

		homepage = new HomePages(driver);

		List<String> data = homepage.getTableData();

		List<String> expectedTableData = Arrays.asList("Kishore", "22", "Delhi", "Manish", "25", "Pune", "Praveen",
				"29", "Bangalore", "Dheepthi", "31", "Mumbai");

		verify.assertEquals(data, expectedTableData);

	}
}