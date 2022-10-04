package com.project.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

    public WriteExcelFile() {

    }

    public void writeExcel(String filepath, String sheetName, String[] dataToWrite) throws IOException {

        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        
        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

        int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();

        XSSFRow row = newSheet.getRow(rowCount+1);

        XSSFRow newRow = newSheet.createRow(rowCount+1);

        for (int i = 0; i < row.getLastCellNum(); i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(dataToWrite[i]);
            
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);
        
        newWorkbook.write(outputStream);

        outputStream.close();

    }

    public void writeCellValue(String filepath, String sheetName, int rowNumber, int CellNumber, String resultText) throws IOException {

        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        
        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

        XSSFRow row = newSheet.getRow(rowNumber);

        XSSFCell firCell = row.getCell(CellNumber-1);

        System.out.println("first cell value is:" + firCell.getStringCellValue());

        XSSFCell nextCell = row.createCell(CellNumber);
        nextCell.setCellValue(resultText);

        System.out.println("nextcell value:" + nextCell.getStringCellValue());

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);

        newWorkbook.write(outputStream);

        outputStream.close();
        



    }
    
}
