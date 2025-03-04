package seleniumpractices;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadingProperiesFile.getProperty("url"));
	}

	@Test
	public void verifyHomePageFunctinality() {

		// Assert current page url
		String currentPageUrl = driver.getCurrentUrl();

		assertEquals(currentPageUrl, "https://demo.guru99.com/test/newtours/index.php");
		assertEquals(currentPageUrl, "https://demo.guru99.com/test/newtours/index.php", "Page url is not matching");

		assertNotEquals(currentPageUrl, "https://www.google.com");
		assertNotEquals(currentPageUrl, "https://www.google.com", "Page url is mismatched");

		// Assert current page title
		String homePageTitle = driver.getTitle();

		assertEquals(homePageTitle, "Welcome: Mercury Tours");
		assertEquals(homePageTitle, "Welcome: Mercury Tours", "Page Title is mismatch");

		WebElement submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));

		assertTrue(submitBtn.isDisplayed());
		assertTrue(submitBtn.isDisplayed(), "Submit is not displayed");

		assertFalse(!(submitBtn.isDisplayed()));
		assertFalse(!(submitBtn.isDisplayed()),"Submit is not displayed");

		// Assert valid login

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
		submitBtn.click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		assertEquals(actualLoginSuccefullMsg, "Login Successfully");

	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}

}
