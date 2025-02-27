package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorStrategies {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		driver.manage().window().maximize();

		WebElement userNameTextField = driver.findElement(By.name("userName"));
		userNameTextField.sendKeys("Parthasarathi Ray");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links : " + links.size());
		
		driver.findElement(By.linkText("Flights")).click();
		
		driver.findElement(By.partialLinkText("tels")).click();
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("Welcome to India");
		
		WebElement title = driver.findElement(By.className("title"));
		
		System.out.println(title.getText());
		

	}

}
