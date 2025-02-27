package seleniumpractices;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement searchTextField = driver.findElement(By.xpath("//input[@title='search']"));
		searchTextField.sendKeys("Codemind Tech");
		Thread.sleep(3000);
		searchTextField.clear();

		//String attribute = searchTextField.getAttribute("size");
		//System.out.println(attribute);

		String accName = searchTextField.getAccessibleName();
		String ariaRole = searchTextField.getAriaRole();

		System.out.println("accname = " + accName + " " + "ariaRole = " + ariaRole);

		Point p = searchTextField.getLocation();
		System.out.println("Width = " + p.getX() + " " + "height = " + p.getY());

		Rectangle r = searchTextField.getRect();
		System.out.println("Width = " + r.width + " " + "height = " + r.height);

		WebElement button = driver.findElement(By.xpath("// input[@id='alert1']"));

		String tagname = button.getTagName();
		System.out.println("taganame : " + tagname);

		System.out.println("Search Text field is displayed = " + searchTextField.isDisplayed());

		WebElement dropdownBtn = driver.findElement(By.cssSelector("button.dropbtn"));
		System.out.println("Background color = " + dropdownBtn.getCssValue("background-color"));

		WebElement dissappersText = driver.findElement(By.cssSelector("#deletesuccess"));

		System.out.println(dissappersText.isDisplayed());

		System.out.println("Male radio button is selected = "
				+ driver.findElement(By.xpath("//input[@id='radio1']")).isSelected());

		driver.findElement(By.xpath("//input[@id='radio1']")).click();

		System.out.println("Female radio buttonis selected = "
				+ driver.findElement(By.xpath("//input[@id='radio2']")).isSelected());

		File file = searchTextField.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("src/test/resources/search.png"));

		System.out.println("Orange Check box is selected = "
				+ driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());

		System.out.println("Blue check box is selected = "
				+ driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected());

		System.out.println("Button1 is enabled = " + driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());

		System.out.println("Button2 is enabled = " + driver.findElement(By.xpath("//button[@id='but2']")).isEnabled());

	}

}
