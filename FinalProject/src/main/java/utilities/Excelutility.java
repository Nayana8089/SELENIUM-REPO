package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class Excelutility {
	static FileInputStream f;  //to read the excel file from the system.
	 static XSSFWorkbook w; //represent the entire excel workbook.
	 static XSSFSheet sh;  //to represent one sheet.

	 public static String readStringData(int row, int col, String sheet) throws IOException {
	  f = new FileInputStream(Constant.EXCELFILE);
	  w = new XSSFWorkbook(f); //to load the excel file into memory using apache poi.
	  sh = w.getSheet(sheet);// to select the sheet 1.
	  XSSFRow r = sh.getRow(row);//to get the row based on the row number.
	  XSSFCell c = r.getCell(col);//to get the data from the column.
	  DataFormatter formatter = new DataFormatter();
	  return formatter.formatCellValue(c);
	  

	 }

	 public static String readIntegerData(int row, int col, String sheet) throws IOException {
	  f = new FileInputStream(Constant.EXCELFILE);
	  w = new XSSFWorkbook(f);
	  sh = w.getSheet(sheet);
	  XSSFRow r = sh.getRow(row);
	  XSSFCell c = r.getCell(col);
	  int val = (int) c.getNumericCellValue(); //convert double to int using typecasting
	  return String.valueOf(val); //convert int to string using valueOf() method
	  
		
	 }

}
