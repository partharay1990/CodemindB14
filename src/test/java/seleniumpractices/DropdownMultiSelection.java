package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement multiSelction = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select options = new Select(multiSelction);

		options.selectByIndex(1); // swift

		Thread.sleep(2000);

		options.selectByValue("Hyundaix"); // Hyundai

		Thread.sleep(2000);

		options.selectByVisibleText("Volvo"); // Volvo

		Thread.sleep(2000);

		options.selectByContainsVisibleText("di"); // Audi

		System.out.println("*****************************************");

		List<WebElement> allSelectedOption = options.getAllSelectedOptions();

		for (WebElement allOption : allSelectedOption) {

			System.out.println("Drop down Options : " + allOption.getText());
		}

		System.out.println("*****************************************");

		WebElement firstSelectedOption = options.getFirstSelectedOption();

		System.out.println("First Select Options : " + firstSelectedOption.getText());

		System.out.println("*****************************************");

		List<WebElement> aption = options.getOptions();

		for (WebElement elm : aption) {

			System.out.println("Drop down option : " + elm.getText());
		}

		System.out.println("*****************************************");

		boolean multiSelectonAllowed = options.isMultiple();

		System.out.println("Multi selection Allowed : " + multiSelectonAllowed);

		options.deSelectByContainsVisibleText("vo"); // volvo

		Thread.sleep(2000);

		options.deselectByIndex(3); // Audi

		Thread.sleep(2000);

		options.deselectByValue("Hyundaix"); // Hyundai

		Thread.sleep(2000);

		options.deselectByVisibleText("Swift"); // Swift
		
		options.selectByIndex(1); // swift

		Thread.sleep(2000);

		options.selectByValue("Hyundaix"); // Hyundai

		Thread.sleep(2000);

		options.selectByVisibleText("Volvo"); // Volvo

		Thread.sleep(2000);

		options.selectByContainsVisibleText("di"); // Audi
		
		options.deselectAll();

	}

}
