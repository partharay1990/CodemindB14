package seleniumpractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadingProperiesFile.getProperty("url"));

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ReadingProperiesFile.getProperty("uname"));
		driver.findElement(By.xpath("//input[@name='password']"))
				.sendKeys(ReadingProperiesFile.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

	public static String getPropeties(String Key) throws IOException {

		File file = new File("src\\test\\resources\\data.properties");
		FileInputStream fileInputStream = new FileInputStream(file);

		Properties properties = new Properties();

		properties.load(fileInputStream);

		return properties.getProperty(Key);
	}

}
