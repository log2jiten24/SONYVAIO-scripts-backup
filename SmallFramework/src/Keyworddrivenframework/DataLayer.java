package Keyworddrivenframework;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.reporters.jq.Main;

public class DataLayer {
	public Object[][] ReadExcel(String file, String file_Name, int columnsize) throws IOException {

		//@SuppressWarnings("resource")
		XSSFWorkbook ob = new XSSFWorkbook(file);

		XSSFSheet sheet = ob.getSheet(file_Name);

		int rowsize = sheet.getLastRowNum();

		Object a[][] = new Object[rowsize][columnsize];

		for (int i = 1; i <= rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {

				if (sheet.getRow(i).getCell(j) != null) {
					CellType type = sheet.getRow(i).getCell(j).getCellTypeEnum();
					if (type == CellType.STRING) {

						a[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					}

					if (type == CellType.NUMERIC) {

						a[i - 1][j] = sheet.getRow(i).getCell(j).getNumericCellValue();
					}

				}

			}
		}

		return a;

	}
}

