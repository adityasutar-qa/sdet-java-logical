package Seleniumtech;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdataxcels {

	public static void main(String[] args) throws IOException {
	FileInputStream File= new FileInputStream("C:\\Users\\Aditya Sutar\\sdet\\Automation_Testing\\TestData\\StaticData.xlsx"); //Open file in reading mode
	
	XSSFWorkbook workbook =  new XSSFWorkbook(File); //extracted workbook 
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");  //Get sheet
	
    int totalrows = sheet.getLastRowNum();  // this will give count of rows 
    
    int totalcells = sheet.getRow(1).getLastCellNum();  //from row we count cell count 
    
    System.out.println("Total number of rows:" + totalrows);
    System.out.println("Total number of cells:" + totalcells);
    
    for(int r=0;r<=totalrows;r++)
    {
    	XSSFRow currentrow=sheet.getRow(r);
    	
    	for(int c=0;c<totalcells;c++)
    	{
    	XSSFCell cell =currentrow.getCell(c);
    	System.out.print(cell.toString()+ "\t");
    	}
    	System.out.println();
	}
    workbook.close();
    File.close();

}
}
