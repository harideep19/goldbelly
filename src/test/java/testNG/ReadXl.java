package testNG;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXl {
	
	
	@Test
	void excelread() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Data\\testdata.xlsx");

				
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		int cells = sheet.getRow(2).getLastCellNum();
		System.out.println(row);
		System.out.println(cells);
		
		for(int r=0;r<row;r++) {
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0;c<cells;c++) {
				XSSFCell cell =currentrow.getCell(c);
				String value = cell.toString();
				System.out.println(value+"");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();

		
	}

}
