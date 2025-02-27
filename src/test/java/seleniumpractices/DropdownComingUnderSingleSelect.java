package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownComingUnderSingleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement singleSelectDropdown = driver.findElement(By.xpath("//select[@id='drop1']"));

		Select select = new Select(singleSelectDropdown);
		List<WebElement> allSelectedOption = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOption) {

			System.out.println(option.getText());
		}

		System.out.println("*********************************************");

		WebElement firstSelectOption = select.getFirstSelectedOption();

		System.out.println("First Select Option = " + firstSelectOption.getText());

		System.out.println("*********************************************");

		List<WebElement> allOption = select.getOptions();

		for (WebElement aption : allOption) {

			System.out.println(" Drop down Option = " + aption.getText());
		}

		System.out.println("*********************************************");

		boolean multiSelectionAllowed = select.isMultiple();

		System.out.println("Multi selection allowed = " + multiSelectionAllowed);

		select.selectByIndex(2); // doc 2 by indexing

		Thread.sleep(2000);

		select.selectByValue("def"); // doc 1 by value

		Thread.sleep(2000);

		select.selectByVisibleText("doc 4"); // doc 4 by visible text/inner-html

		Thread.sleep(2000);

		select.selectByContainsVisibleText("3"); // doc 3 partial text

		select.deselectByIndex(0);

	}

}
