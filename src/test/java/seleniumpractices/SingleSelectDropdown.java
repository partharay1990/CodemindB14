package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement singleSelect = driver.findElement(By.xpath("//select[@id='drop1']"));

		Select option = new Select(singleSelect);

		List<WebElement> allOption = option.getAllSelectedOptions();

		for (WebElement elm : allOption) {

			System.out.println(elm.getText());
		}

		System.out.println("***************************************");

		WebElement firstElement = option.getFirstSelectedOption();

		System.out.println("First Selected option : " + firstElement.getText());

		System.out.println("***************************************");

		List<WebElement> getOpt = option.getOptions();

		for (WebElement webl : getOpt) {

			System.out.println("Drop down options : " + webl.getText());
		}

		System.out.println("***************************************");

		boolean multipleSelction = option.isMultiple();

		System.out.println("Multiple selection is : " + multipleSelction);

		option.selectByContainsVisibleText("c 3"); // doc 3

		Thread.sleep(2000);

		option.selectByIndex(0); // Older Newsletters

		Thread.sleep(2000);

		option.selectByValue("def"); // doc 1

		Thread.sleep(2000);

		option.selectByVisibleText("doc 2");

		//option.deselectByIndex(0);

	}

}
