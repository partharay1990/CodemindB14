package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgGroups {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadingProperiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test(groups = { "regression", "smoke" }, priority = 1, dataProvider = "uservalidlogindata")
	public void verifyValidLogin(String uname, String pass) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String actulaLoginSuccess = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		Assert.assertEquals(actulaLoginSuccess, "Login Successfully");

	}

	@Test(groups = { "smoke" }, priority = 3)
	public void verifyHomePageUrl() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");

	}

	@Test(groups = { "sanity" }, priority = 2)
	public void homePageTitle() {

		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Welcome: Mercury Tours");
	}

	@DataProvider(name = "uservalidlogindata")
	public String[][] userData() {

		String data[][] = { { "admin", "admin@123" }, { "user1", "user@456" }, { "user2", "user@789" } };

		return data;
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		driver.quit();
	}

}
