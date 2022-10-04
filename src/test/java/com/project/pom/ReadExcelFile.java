package com.project.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;;;;

public class ReadExcelFile {

    public ReadExcelFile() {

    }
    public void readExcel( String filepath, String SheetName) throws IOException {
        
        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);

        XSSFSheet newSheet = newWorkbook.getSheet(SheetName);

        int rowCount = newSheet.getLastRowNum() + newSheet.getFirstRowNum();
        
        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = newSheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.println(row.getCell(j).getStringCellValue() + "||");
            }
        }

    }

    public String getCellValue(String filepath, String sheetName, int rowNumber, int CellNumber) throws IOException {

        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);

        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

        XSSFRow row = newSheet.getRow(rowNumber);

        XSSFCell cell = row.getCell(CellNumber);

        return cell.getStringCellValue();

    }
    
}
