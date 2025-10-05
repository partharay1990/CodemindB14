package testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OnlyForTestingPage;


public class VerifyOnlyTestingPage extends BaseTest {

	HomePage homePage;
	OnlyForTestingPage onlyForTestingPage;

	@Test(groups = { "smoke" })
	public void verifyOnlyTestingPage() {

		homePage = new HomePage(driver);
		homePage.getOnlyTestingBlogLink().click();

		onlyForTestingPage = new OnlyForTestingPage(driver);

		assertTrue(onlyForTestingPage.verifyFirstNameTextFieldEnabled(), "First name text field is disabled");
		assertFalse(onlyForTestingPage.verifyLastNameTextFieldEnabled(), "Last name text field is enabled");

	}

}
