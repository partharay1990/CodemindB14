package seleniumpractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		ReadingExcelFile.readingExcel();

	}

	public static void readingExcel() throws InvalidFormatException, IOException {

		File file = new File("src/test/resources/registrationdetails.xlsx");

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
		XSSFSheet sheet = xssfWorkbook.getSheet("registrationdata");
		int lastRowNum = sheet.getLastRowNum();

		for (int i = 0; i <=lastRowNum; i++) {

			XSSFRow row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();

			for (int j = 0; j < lastCell; j++) {

				XSSFCell cell = row.getCell(j);

				if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {

					System.out.println(cell.getNumericCellValue());
				}

				if (cell.getCellType() == cell.CELL_TYPE_STRING) {

					System.out.println(cell.getStringCellValue());
				}
			}

		}

	}

}
