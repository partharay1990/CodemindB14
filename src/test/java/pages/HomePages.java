package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class HomePages {

	List<WebElement> tableCellElements;

	WebDriver driver;
	WebElement onlyForTestingLink;

	public HomePages(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getTableCellElements() {
		this.setTableCellElements();
		return tableCellElements;
	}

	public void setTableCellElements() {
		this.tableCellElements = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
	}

	public WebElement getOnlyForTestingLink() {
		this.setOnlyForTestingLink();
		return onlyForTestingLink;
	}

	public void setOnlyForTestingLink() {
		this.onlyForTestingLink = driver.findElement(By.xpath("//a[text()='onlytestingblog']"));
	}

	//methods
	public List<String> getTableData() {

		List<String> data = new ArrayList<String>();

		List<WebElement> tabledata = getTableCellElements();

		for (WebElement td : tabledata) {

			data.add(td.getText());
		}

		return data;

	}

}
