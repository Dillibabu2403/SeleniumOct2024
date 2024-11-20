package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {

	public static String[][] readExcelData(String Excelfilename) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+Excelfilename+".xlsx");
		XSSFSheet sheetAt = wb.getSheetAt(0);
		/*
		 * XSSFRow row = sheetAt.getRow(1); XSSFCell cell = row.getCell(1); String
		 * singleData = cell.getStringCellValue(); System.out.println(singleData);
		 */
	int rowCount = sheetAt.getLastRowNum();
	System.out.println(rowCount);
	short colCount = sheetAt.getRow(0).getLastCellNum();
	System.out.println(colCount);
	String[][]data=new String[rowCount][colCount];
	for(int i=1;i<=rowCount;i++) {
		XSSFRow row2 = sheetAt.getRow(i);
		for(int j=0;j<colCount;j++) {
			XSSFCell cell2 = row2.getCell(j);
			String readData = cell2.getStringCellValue();
			System.out.println(readData);
			data[i-1][j]=readData;
			
		}
	}
	wb.close();
	return data;

	}

}
