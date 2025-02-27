package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTabularData {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> tableElement = driver.findElements(By.xpath("//table[@id='table1']"));

		for (WebElement elm : tableElement) {

			System.out.println("All Table Data : \n" + elm.getText());
		}

		tableElement.clear();

		System.out.println("**********************************************************");

		tableElement = driver.findElements(By.xpath("//table[@id='table1']//tr[3]"));

		for (WebElement elm : tableElement) {

			System.out.println("3rd Row data : \n" + elm.getText());
		}
		
		tableElement.clear();
		
		System.out.println("**********************************************************");
		
		System.out.println("3rd row 2nd column data :"+ driver.findElement(By.xpath("(//table[@id='table1']//tr[3]//td)[2]")).getText());

	}

}
