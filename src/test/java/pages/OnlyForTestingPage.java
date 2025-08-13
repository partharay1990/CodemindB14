package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlyForTestingPage {

	// web element
	WebDriver driver;
	WebElement firstNameTextField;
	WebElement lastNameTextField;

	// Page constructor
	public OnlyForTestingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameTextField() {
		setFirstNameTextField();
		return firstNameTextField;
	}

	public void setFirstNameTextField() {
		this.firstNameTextField = driver.findElement(By.cssSelector("#text1"));
	}

	public WebElement getLastNameTextField() {
		setLastNameTextField();
		return lastNameTextField;
	}

	public void setLastNameTextField() {
		this.lastNameTextField = driver.findElement(By.cssSelector("#text2"));
	}

	// page Methods

	public boolean verifyFirstNameTextFieldEnabled() {

		return getFirstNameTextField().isEnabled();
	}

	public boolean verifyLastNameTextFieldEnabled() {

		return getLastNameTextField().isEnabled();
	}

}
