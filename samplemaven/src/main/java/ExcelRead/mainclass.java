package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mainclass {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a, int b) throws IOException
	{
		f= new FileInputStream("/Users/sujithrajrajasekharan/Desktop/Salary.xlsx");
		w= new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static int getIntegerData(int a, int b) throws IOException
	{
		f= new FileInputStream("/Users/sujithrajrajasekharan/Desktop/Salary.xlsx");
		w= new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		
		//typecasting - It is a conversion from one data type to another.
		int x = (int) c.getNumericCellValue();
		return x;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(mainclass.getStringData(1,0));
		System.out.println(mainclass.getIntegerData(1,1));
	}

}
