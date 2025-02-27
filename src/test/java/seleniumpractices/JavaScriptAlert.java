package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='confirm']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        
        driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Codemind");
        driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("Codemind");
        

	}

}
