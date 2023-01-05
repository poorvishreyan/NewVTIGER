package com.DemoGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum)
	{
		FileInputStream fileinputstream = null;
		try {
			 fileinputstream = new FileInputStream(IAutoConstants.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			 workbook = WorkbookFactory.create(fileinputstream);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		DataFormatter dataformatter = new DataFormatter();
		String value = dataformatter.formatCellValue(cell);
		return value;
	}
	
	
	public void insertDataIntoexce(String sheetName, int rowNum, int cellNum, String data)
	{
		FileInputStream fileinputstream = null;
		try {
			 fileinputstream = new FileInputStream(IAutoConstants.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
		 workbook = WorkbookFactory.create(fileinputstream);
		} catch (EncryptedDocumentException e) {
						e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
					cell.setCellValue(data);
					
		FileOutputStream fileoutputstream = null;
		try {
			fileoutputstream = new FileOutputStream(IAutoConstants.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			workbook.write(fileoutputstream);
		} catch (Exception e) {
		
		}
		}
	
	
	public int getLastRowNum(String sheetName)
	{
		FileInputStream fileinputstream = null;
		try {
			 fileinputstream = new FileInputStream(IAutoConstants.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			WorkbookFactory.create(fileinputstream);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		int row = sheet.getLastRowNum();
		return row;
		
		
	}
		
	}
		
		
		
				
	


