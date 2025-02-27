package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyValidLogin {

	WebDriver driver;

	@BeforeMethod

	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadingProperiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void verifyValidLogin() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ReadingProperiesFile.getProperty("uname"));
		driver.findElement(By.xpath("//input[@name='password']"))
				.sendKeys(ReadingProperiesFile.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String actulaLoginSuccess = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		Assert.assertEquals(actulaLoginSuccess, "Login Successfully");
	}

	@Test
	public void verifyHomePageUrl() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");

	}

	@Test
	public void verifyHomePageTitle() {

		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Welcome: Mercury Tours");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}
