package com.freeHRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream fs=new FileInputStream("F:\\Selenium Learnings\\freeHRM\\src\\main\\java\\com\\freecrm\\Configurations\\config.properties");
			try {
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("IOException");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception occured");
		}
	}
	
	public static void Intialization()
	{
		//System.out.println(prop.getProperty("url"));
		if(prop.get("browser").equals("chrome"))
		{
			System.out.println("CHROME BROWSER");
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("No browser"); 
		}
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get(prop.getProperty("url"));
		
				
	}
	
	/*public static void main(String[] args)
	{
		System.out.println("HI");
		TestBase t=new TestBase();
		Intialization();
		
	}*/
		
}



