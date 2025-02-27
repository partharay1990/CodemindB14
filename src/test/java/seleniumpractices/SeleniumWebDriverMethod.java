package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriverMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		System.out.println("*****************************************");

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current opened url : " + currentUrl);

		System.out.println("*****************************************");

		String pageSource = driver.getPageSource();
		System.out.println("Page Source \n " + pageSource);

		System.out.println("*****************************************");

		String title = driver.getTitle();
		System.out.println("Current page title : " + title);

		System.out.println("*****************************************");

		String currentFocusedWindow = driver.getWindowHandle();
		System.out.println("Current Focused Window : " + currentFocusedWindow);

		System.out.println("*****************************************");

		driver.switchTo().newWindow(WindowType.TAB).get("https://demo.guru99.com/test/newtours/index.php");

		Set<String> windowHandle = driver.getWindowHandles();

		for (String handle : windowHandle) {

			System.out.println(handle);
		}

		System.out.println("*****************************************");

		driver.navigate().to("https://www.flipkart.com/");

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		driver.close();
		
		driver.quit();

	}

}
