package JavaPratices;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumpractices.ReadingProperiesFile;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(ReadingProperiesFile.getProperty("rurl"));
		driver.manage().window().maximize();

		List<Object> ls = ReadingExcelFile.readExcel();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(ls.get(0).toString());
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(ls.get(1).toString());
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(ls.get(2).toString());
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ls.get(3).toString());
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(ls.get(4).toString());
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(ls.get(5).toString());
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(ls.get(6).toString());
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(ls.get(7).toString());
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("INDIA");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(ls.get(8).toString());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ls.get(9).toString());
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(ls.get(10).toString());

		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

	public static List<Object> readExcel() throws InvalidFormatException, IOException {

		List<Object> lst = new ArrayList<Object>();
		File file = new File("src/test/resources/registrationdetails.xlsx");

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);

		XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

		int lastRowNum = sheet.getLastRowNum();

		for (int i = 1; i <= lastRowNum; i++) {

			XSSFRow row = sheet.getRow(i);

			int lastCellNum = row.getLastCellNum();

			for (int j = 0; j < lastCellNum; j++) {

				XSSFCell cell = row.getCell(j);

				if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
					lst.add(cell.getNumericCellValue());
				}

				if (cell.getCellType() == cell.CELL_TYPE_STRING) {

					lst.add(cell.getStringCellValue());
				}

			}

		}
		xssfWorkbook.close();
		return lst;

	}
}
