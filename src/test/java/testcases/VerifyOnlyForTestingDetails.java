package testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePages;
import pages.OnlyForTestingPage;

public class VerifyOnlyForTestingDetails extends BaseTest {

	HomePages homePage;
	OnlyForTestingPage onlyForTestingPage;

	@Test

	public void verifyOnlyForTestingDetails() {
		
		homePage = new HomePages(driver);
		homePage.getOnlyForTestingLink().click();
		onlyForTestingPage = new OnlyForTestingPage(driver);
		
		assertTrue(onlyForTestingPage.verifyFirstNameTextFieldEnabled(),"first name textfield is disabled");
		assertFalse(onlyForTestingPage.verifyLastNameTextFieldEnabled(),"Last name textfield is disabled");
	}

}
