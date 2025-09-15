package Seleniumtech;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdataxcels {

	public static void main(String[] args) throws IOException {
	
	FileOutputStream File= new FileOutputStream("C:\\Users\\Aditya Sutar\\sdet\\Automation_Testing\\TestData\\myfile.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("Data");
	
	XSSFRow row1 = sheet.createRow(0);
	row1.createCell(0).setCellValue("Python");
	row1.createCell(1).setCellValue("Java");
	row1.createCell(2).setCellValue("c#");
	row1.createCell(3).setCellValue("Typescript");
	
	XSSFRow row2 = sheet.createRow(1);
	row2.createCell(0).setCellValue("Aditya");
	row2.createCell(1).setCellValue("Rahul");
	row2.createCell(2).setCellValue("Abhilash");
	row2.createCell(3).setCellValue("Sarang");
	
	XSSFRow row3 = sheet.createRow(2);
	row3.createCell(0).setCellValue("Ranker");
	row3.createCell(1).setCellValue("NA");
	row3.createCell(2).setCellValue("Double ranker");
	row3.createCell(3).setCellValue("Loading");
	
	
	workbook.write(File);
	workbook.close();
	File.close();
	
	System.out.println("File is created");
	
		
		 
		
		
		
		
		
		
	}

}
