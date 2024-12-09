package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleData {
	public static void main(String[] args) throws Exception 
	{
		FileInputStream file = new FileInputStream("./Testdata/Facebook credentials.xlsx");
		XSSFWorkbook fis = new XSSFWorkbook(file);
		XSSFSheet sheet = fis.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(1);
		XSSFRichTextString val = cel.getRichStringCellValue();
		System.out.println(val);
		workbook.close();
	}

}
