package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedActionInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement searchBox = driver.findElement(By.cssSelector("textarea#APjFqb"));

		// actions.contextClick(searchBox).build().perform(); // Right click

		actions.doubleClick(searchBox).build().perform(); // Double click on search box

		// actions.keyDown(searchBox, "B").keyUp("B").build().perform(); // single key
		// press and release

		actions.keyDown(searchBox, Keys.SHIFT).keyDown("p").keyUp(searchBox, Keys.SHIFT).keyUp("p").keyDown("a")
				.keyUp("a").keyDown("r").keyUp("r").keyDown("t").keyUp("t").keyDown("h").keyUp("h").keyDown("a")
				.keyUp("a").build().perform(); // multiple key press and release

		WebElement links = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));

		actions.moveToElement(links).build().perform(); // mouse hover

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		WebElement source = driver.findElement(By.cssSelector("#draggable"));

		WebElement target = driver.findElement(By.cssSelector("#droppable"));

		// actions.dragAndDrop(source, target).build().perform(); // Drag and drop

		actions.clickAndHold(source).moveToElement(target).release().build().perform();

		driver.navigate().to("https://omayo.blogspot.com/");
		
		actions.scrollByAmount(0, 2000).build().perform();

		WebElement blogMenu = driver.findElement(By.cssSelector("#blogsmenu"));

		actions.moveToElement(blogMenu).build().perform();

		driver.findElement(By.xpath("(//div[@id='cssmenu']//ul//ul//a)[2]")).click();
		
		

	}
}
