package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static   WebDriver driver;
	public static  void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void loadUrl(String url) {
		driver.get(url);

	}
	public  void fill(WebElement e,String data) {
		e.sendKeys(data);
	}
	public  void dropDown(WebElement e, String data) {
		Select s=new Select(e);
		s.selectByVisibleText(data);
	}
	public  void btnClick(WebElement e) {
		e.click();
	}
	public void getConsole(WebElement e) {
		String result = e.getAttribute("value");
		System.out.println(result);
	}
	public  void excel(String loc,String sheetName,String cellValue,int row, int cell) throws IOException  {
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetName);
		sheet.createRow(row).createCell(cell).setCellValue(cellValue);
		FileOutputStream output=new FileOutputStream(loc);
		w.write(output);
		
		
	}

}
