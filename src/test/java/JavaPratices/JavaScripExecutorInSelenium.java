package JavaPratices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExecutorInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

//		// scroll horizontally by using pixel
//		javascriptExecutor.executeScript("window.scrollBy(0,1000)"); // downward y-axis
//
//		Thread.sleep(2000);
//
//		javascriptExecutor.executeScript("window.scrollBy(0,-500)", ""); // upward y-axis
//
//		Thread.sleep(2000);
//		// scroll vertically by using pixel
//
//		javascriptExecutor.executeScript("window.scrollBy(100,0)", ""); // to right x-ais
//
//		Thread.sleep(2000);
//
//		javascriptExecutor.executeScript("window.scrollBy(-100,0)", ""); // to left x-axis

//		// scroll complete height of page
//
//		javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//		// scroll complete width of page
//
//		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");
//
//		// scroll into view

		WebElement userNameTextField = driver.findElement(By.xpath("//input[@name='userid']"));

		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", userNameTextField);

		userNameTextField.sendKeys("Codemind");

	}

}
