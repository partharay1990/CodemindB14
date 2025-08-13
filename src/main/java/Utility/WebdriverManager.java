package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	private static WebDriver driver;

	public WebdriverManager() {

	}

	public static WebDriver getDriver() {

		if (driver == null) {

			String browser = Util.getProperty("browser");
			browser = browser.toLowerCase();

			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("Please provide valid browser name");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		return driver;

	}

}
