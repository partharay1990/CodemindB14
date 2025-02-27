package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.com/");

		WebDriverManager.chromedriver().setup();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// driver.quit();

		driver.findElement(By.name("q")).sendKeys("Mobile");

	}

}
