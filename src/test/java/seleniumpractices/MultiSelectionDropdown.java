package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement multiSelectDropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(multiSelectDropdown);

		select.selectByIndex(2); // Hyundai

		Thread.sleep(2000);

		select.selectByValue("swiftx"); // swift

		Thread.sleep(2000);

		select.selectByVisibleText("Volvo"); // volvo

		Thread.sleep(2000);

		select.selectByContainsVisibleText("di"); // Audi

		List<WebElement> allSelectedOption = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOption) {

			System.out.println("All selected option = " + option.getText());
		}

		System.out.println("************************************");

		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option = " + firstSelectedOption.getText());

		System.out.println("************************************");

		List<WebElement> allOption = select.getOptions();

		for (WebElement aption : allOption) {

			System.out.println("Drop down option = " + aption.getText());
		}

		System.out.println("************************************");

		boolean multiSelectionAllowed = select.isMultiple();

		System.out.println("Multi selection allowed = " + multiSelectionAllowed);

		select.deselectByIndex(3); // audi

		Thread.sleep(2000);

		select.deselectByValue("volvox"); // volvo

		Thread.sleep(2000);

		select.deselectByVisibleText("Swift"); // swift

		Thread.sleep(2000);

		select.deSelectByContainsVisibleText("dai"); // Hyundai

		select.selectByIndex(2); // Hyundai

		Thread.sleep(2000);

		select.selectByValue("swiftx"); // swift

		Thread.sleep(2000);

		select.selectByVisibleText("Volvo"); // volvo

		Thread.sleep(2000);

		select.selectByContainsVisibleText("di"); // Audi

		select.deselectAll();

	}

}
