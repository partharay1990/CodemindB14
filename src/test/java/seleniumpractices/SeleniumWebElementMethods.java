package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebElementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement textAreaField = driver.findElement(By.xpath("//textarea[@id='ta1']"));

		textAreaField.sendKeys("Hi, Good Morning.");

		Thread.sleep(3000);

		textAreaField.clear();

		String attribute = textAreaField.getAttribute("contenteditable");
		System.out.println(attribute);

		String acceName = textAreaField.getAccessibleName();
		String getArial = textAreaField.getAriaRole();

		System.out.println("accName = " + acceName + "   " + "ariaRole = " + getArial);

		Point p = textAreaField.getLocation();

		System.out.println("x = " + p.getX() + " " + " y = " + p.getY());

		Rectangle rect = textAreaField.getRect();

		System.out.println("height = " + rect.height + "  " + "width = " + rect.width);

		Dimension dem = textAreaField.getSize();

		System.out.println("height = " + dem.height + "  " + "width = " + dem.width);

		String tagname = textAreaField.getTagName();

		System.out.println("tag name = " + tagname);
		
        WebElement dropBtn = driver.findElement(By.cssSelector("button.dropbtn"));
		
		System.out.println("Background color = " + dropBtn.getCssValue("background-color"));

		System.out.println("text area is displayed : " + textAreaField.isDisplayed());
		
		WebElement textIsdisplay = driver.findElement(By.cssSelector("#deletesuccess"));
		
		System.out.println(textIsdisplay.isDisplayed());
		
		Thread.sleep(25000);
		
		System.out.println(textIsdisplay.isDisplayed());
		
		System.out.println("Button1 is Enabled = " + driver.findElement(By.cssSelector("#but1")).isEnabled());
		
		System.out.println("Button2 is Enabled = " + driver.findElement(By.cssSelector("#but2")).isEnabled());
		
		System.out.println("Male radio button is selected : " +driver.findElement(By.cssSelector("#radio1")).isSelected());
		
		driver.findElement(By.cssSelector("#radio1")).click();
		
		System.out.println("Female radio button is selected : " +driver.findElement(By.cssSelector("#radio1")).isSelected());
		
		System.out.println("Orange checkbox is selected : " + driver.findElement(By.cssSelector("#checkbox1")).isSelected());
		
		System.out.println("Blue checkbox is selected : " + driver.findElement(By.cssSelector("#checkbox2")).isSelected());
		
		File file = textAreaField.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("src/test/resources/screenshog.jpg"));
		

	}

}
