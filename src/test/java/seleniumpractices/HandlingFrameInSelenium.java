package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrameInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.cssSelector("iframe#navbar-iframe"));
		driver.switchTo().frame(frame);
	   //driver.switchTo().frame(0);
		//driver.switchTo().frame("navbar-iframe");

		driver.findElement(By.xpath("//table//input[@name='q' and @class='ENqPLc']")).sendKeys("Codemind Tech");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("Welc0me to Codemind Tech");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//table//input[@name='q' and @class='ENqPLc']")).clear();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("textarea#ta1")).clear();
		
		
		
	}

}
