package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerAssignment {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();

		//SelectDate("2021", "October", "22");
		SelectDate("2025", "March", "07");

	}

	public static void SelectDate(String year, String month, String SelectedDate) {

		driver.findElement(By.xpath("//input[@id='datetimepicker2']")).click();

		driver.findElement(By.xpath("(//input[@aria-label='Year'])[2]")).clear();

		driver.findElement(By.xpath("(//input[@aria-label='Year'])[2]")).sendKeys(year);

		Select newSelect = new Select(driver.findElement(By.xpath("(//select[@aria-label='Month'])[2]")));
		newSelect.selectByVisibleText(month);

		List<WebElement> allDate = driver.findElements(By.xpath(
				"(//div[@class='dayContainer'])[2]//span[not(@class='flatpickr-day prevMonthDay') and not(@class='flatpickr-day nextMonthDay')]"));

		for (WebElement date : allDate) {

			if (date.getText().equals(SelectedDate)) {
				date.click();
				break;
			}
		}

		driver.findElement(By.xpath("(//input[@aria-label='Hour'])[2]")).sendKeys("11");
		driver.findElement(By.xpath("(//input[@aria-label='Minute'])[2]")).sendKeys("50");
		driver.findElement(By.xpath("(//span[@title='Click to toggle'])[2]")).sendKeys("PM");

		driver.findElement(By.xpath("//h1[text()='Date Picker']")).click();

	}

}
