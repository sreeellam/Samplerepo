package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s; 
	public static String getStringData(int a, int b, String sheet) throws IOException
	{
//f= new FileInputStream("/Users/sujithrajrajasekharan/eclipse-workspace/GroceryApplication/src/test/resources/TestData1.xlsx");
		f= new FileInputStream(Constant.TESTDATA1);
		w= new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static int getIntegerData(int a, int b, String sheet) throws IOException
	{
//f= new FileInputStream("/Users/sujithrajrajasekharan/eclipse-workspace/GroceryApplication/src/test/resources/TestData1.xlsx");
		f= new FileInputStream(Constant.TESTDATA1);
		w= new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		
		//typecasting - It is a conversion from one data type to another.
		int x = (int) c.getNumericCellValue();
		return x;
	}

}
