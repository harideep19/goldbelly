package testNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	
	@Test
	void write() throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Data\\Testwrite.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue("code");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("java");
		row2.createCell(1).setCellValue("code");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("reactjava");
		row3.createCell(1).setCellValue("code");
		
		workbook.write(file);
;		
	}

}
