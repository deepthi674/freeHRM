package com.freeHRM.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class TestUtils 
{
	static String test_path="F:\\Selenium Learnings\\freeHRM\\src\\main\\java\\com\\freeHRM\\TestData\\FreeHRMTestData.xlsx";
	static String sheetName="login";
	static Workbook book;
	static Sheet s;
	
	public static boolean isdisplayed(WebElement element,String msg)
	{
		boolean t=element.isDisplayed();
		if(t==true)
		{
			System.out.println(msg+"isdisplayed");
		}
		else
			System.out.println(msg+"isnotdisplayed");
		return element.isDisplayed();
	}
	
	public static Object[][] getData()
	{
		try {
			FileInputStream fis=new FileInputStream(test_path);
			try {
				book=WorkbookFactory.create(fis);
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s=book.getSheet(sheetName);
		Object[][] data=new Object[s.getLastRowNum()][s.getRow(0).getLastCellNum()];
		for (int i=0;i<s.getLastRowNum();i++)
		{
			for (int j=0;j<s.getRow(i).getLastCellNum();j++)
			{
				data[i][j]=s.getRow(i+1).getCell(j).getStringCellValue();
				System.out.println(data[i][j]);
			}
		}
		return data ;
		
		
	}

	
	/*public static void main (String args[])
	{
		getData();
	}*/
}
