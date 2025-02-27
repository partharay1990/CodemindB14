package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDataPicker {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();

		datePicker("2025", "February", "21");

	}

	public static void datePicker(String year, String month, String date) {

		driver.findElement(By.cssSelector("#datetimepicker1")).click();

		driver.findElement(By.xpath("//input[@aria-label='Year']")).clear();

		driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys(year);

		WebElement selectedmonths = driver.findElement(By.xpath("//select[@aria-label='Month']"));

		Select selected = new Select(selectedmonths);

		selected.selectByVisibleText(month);

		List<WebElement> dateSelected = driver.findElements(By.xpath(
				"(//div[@class='dayContainer'])[1]//span[not(@class='flatpickr-day prevMonthDay') and not(@class='flatpickr-day nextMonthDay')]"));

		for (WebElement elm : dateSelected) {

			if (elm.getText().equals(date)) {
				elm.click();

				break;
			}
		}

		driver.findElement(By.xpath("//h1[text()='Date Picker']")).click();

	}

}
