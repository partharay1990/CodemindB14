package stepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utility.Util;
import Utility.WebdriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;

	@Before
	public void beforeScenario() {
		// ExtentCucumberAdapter.addTestStepLog("Statrted Scenario !!");
		System.out.println("This will run before the Scenario");
	}

	@Given("^launch Application$")
	public void launchApplication() {

		driver = WebdriverManager.getDriver();
		driver.get(Util.getProperty("url"));

	}

	@When("^enter valid uname (.*)$")

	public void enterValidUserName(String uName) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uName);
	}

	@And("^enter valid pass (.*)$")

	public void enterValidPassword(String pass) {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	}

	@And("^click on submit button$")

	public void clickSubmitButton() {

		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("^verify user logged in successfully$")

	public void verifyUserLoggedinSuccessfully() {

		String actual = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		assertEquals(actual, "Login Successfully", "User not able to logged in ");

	}

	@When("^enter invalid username and password$")
	public void enterInvalidUnameAndPass(DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(list.get(0).get("uname"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(0).get("password"));
	}

	@Then("^verify user not logged in successfully$")
	public void verifyUserNotLoggedInSuccessfully() {

		assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"))
				.isDisplayed());
	}

	@And("^close browser$")
	public void tearDownDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
    @After
	public void clean() {

		// ExtentCucumberAdapter.addTestStepLog("Scenario end !!");
		System.out.println("This will run after the Scenario");
	}

}
