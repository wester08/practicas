package com.project.pom;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDrivenTesting_SWD_Test {

    private WebDriver driver;
    private WriteExcelFile writefile;
    private ReadExcelFile readFile;
    private By searchBoxLocator = By.className("search_query");
    private By searchBtnLocator = By.name("submit_search");
    private By resulttextLocator = By.cssSelector("span.heading-counter");




 @Before
 public void setUp() throws Exception {
    System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
        writefile = new WriteExcelFile();
        readFile = new ReadExcelFile();
       
        driver.get("http://automationpractice.com");

    }
    
 @After
public void tearDowm() throws Exception {
    driver.quit();
}
@Test
public void test() throws IOException, InterruptedException {
    String filepath = "C:\\Users\\Wester\\Documents\\Test.xlsx";

    String searchText = readFile.getCellValue(filepath, "Sheet1", 0, 0);

    driver.findElement(searchBoxLocator).sendKeys(searchText);
    driver.findElement(searchBtnLocator).click();
    Thread.sleep(3000);
    String resultText = driver.findElement(resulttextLocator).getText();

    System.out.println("Page result tect" + resultText);

    readFile.readExcel(filepath, "Sheet1");

    writefile.writeCellValue(filepath, "Sheet1", 0, 1, resultText);

    readFile.readExcel(filepath, "Sheet1");





    
}

}
