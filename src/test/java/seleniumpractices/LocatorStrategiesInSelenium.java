package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategiesInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://demo.guru99.com/test/newtours/");

		// By.name
		WebElement userNameTextField = driver.findElement(By.name("userName"));
		userNameTextField.sendKeys("codemind");

		// By.tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links = " + links.size());

		// By.linkText
		WebElement flightLinks = driver.findElement(By.linkText("Flights"));
		flightLinks.click();

		// By.partialLinkText
		WebElement hotelsLink = driver.findElement(By.partialLinkText("Car"));
		hotelsLink.click();

		driver.navigate().to("https://omayo.blogspot.com/");

		// By.id

		driver.findElement(By.id("ta1")).sendKeys("Welcome to Codemind Techlogy");

		// By.className
		WebElement title = driver.findElement(By.className("title"));

		System.out.println(title.getText());

		driver.manage().window().maximize();

	}

}
