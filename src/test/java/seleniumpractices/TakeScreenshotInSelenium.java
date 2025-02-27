package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotInSelenium {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File scr = screenShot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scr, new File("src/test/resources/" + System.currentTimeMillis() + ".jpeg"));
	}

}
