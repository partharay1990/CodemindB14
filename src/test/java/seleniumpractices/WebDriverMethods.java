package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		System.out.println("*****************************************");

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current page Url = " + currentUrl);

		System.out.println("*****************************************");

		String title = driver.getTitle();
		System.out.println(" Current page title = " + title);

		System.out.println("*****************************************");

		String pageSource = driver.getPageSource();
		System.out.println("Current page source :" + pageSource);

		System.out.println("*****************************************");

		String currentFocusedWindowHandle = driver.getWindowHandle();
		System.out.println("Current focused window/tab handle = " + currentFocusedWindowHandle);

		System.out.println("*****************************************");

		driver.switchTo().newWindow(WindowType.TAB).get("https://demo.guru99.com/test/newtours/index.php");

		Set<String> windowsHandle = driver.getWindowHandles();

		for (String handle : windowsHandle) {

			System.out.println(handle);
		}

		System.out.println("*****************************************");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.quit();

	}

}
