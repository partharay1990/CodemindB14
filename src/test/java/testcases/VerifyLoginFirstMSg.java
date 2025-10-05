package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utility.Util;
import pages.HomePage;
import pages.ShareWithTwitterSignUpPage;

public class VerifyLoginFirstMSg extends BaseTest {

	HomePage homePage;
	ShareWithTwitterSignUpPage shareWithTwitterSignUpPage;

	@Test
	public void verifyLoginFirstMSg() {

		homePage = new HomePage(driver);
		Util.switchToFrame(driver, homePage.getNavFrame());
		Util.selectOptionFromDropdown(homePage.getMoreOptionropdown(), "Share with Twitter");
		Util.switchToDefaultContent(driver);
		String parentWindow = Util.switchToChildWindow(driver);

		shareWithTwitterSignUpPage = new ShareWithTwitterSignUpPage(driver);

		assertEquals(shareWithTwitterSignUpPage.getWantToLogInFirstText(), "Want to log in first?",
				"Text is not matching");

		driver.close();

		Util.switchToWindow(driver, parentWindow);
		
		System.out.println(driver.getTitle());
	}

}
