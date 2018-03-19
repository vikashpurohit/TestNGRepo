package libClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelConfig {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ReadExcelConfig(String excelFilePath) {

		try {
			File file = new File(excelFilePath);

			FileInputStream fileInputStream = new FileInputStream(file);

			workbook = new XSSFWorkbook(fileInputStream);

			// workbook.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getData(int sheetNumber, int rowNumber, int ColoumNumber) {

		sheet = workbook.getSheetAt(sheetNumber);
		String data = sheet.getRow(rowNumber).getCell(ColoumNumber).getStringCellValue();

		return data;
	}

	public int getRowCont(int indexNumber) {

		int row = workbook.getSheetAt(indexNumber).getLastRowNum();
		row = row + 1;
		return row;
	}
}