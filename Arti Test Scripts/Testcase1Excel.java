package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Workbook;


public class Testcase1Excel {
	
	
	public static void main(String[] args) throws Exception {
		//Initiating the excel
				File src =new File("C:\\Selenium downloads\\NewusersTestdata.xls");
				System.out.println("Excel located");
				Workbook wb=Workbook.getWorkbook(src);
				String name=wb.getSheet(0).getCell(0,1).getContents();
				String email=wb.getSheet(0).getCell(1,1).getContents();
				String password=wb.getSheet(0).getCell(2,1).getContents();
		//
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Selenium downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
        
		driver.get("http://localhost/MSA5/public");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys(name);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[3]/div/input")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/input")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click();
		
		
		
				
	}

}
