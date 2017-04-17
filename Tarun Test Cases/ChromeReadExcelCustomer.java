package Testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;

public class ChromeReadExcelCustomer {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","T:\\8210 ISQA - MSD\\Assignment 4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://efs-tarun.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("tarun2@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("tarun2");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/a/h3/p")).click();
		
		
		File src = new File("T:\\8210 ISQA - MSD\\Assignment 4\\CustomersAdd.xls");
		Workbook wb = Workbook.getWorkbook(src);
		int n = wb.getSheet(0).getRows();
		
	for(int i=0;i<=n;i++)
		{
		 		int j =0;
			 	driver.findElement(By.xpath("html/body/div[2]/a")).click();
			 	String s1 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(s1);
			 	j++;
			 	String s2 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='cust_number']")).sendKeys(s2);
			 	j++;
			 	String s3 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys(s3);
			 	j++;
			 	String s4 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(s4);
			 	j++;
				String s5 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='state']")).sendKeys(s5);
			 	j++;
			 	String s6 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys(s6);
			 	j++;
			 	String s7 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(s7);
			 	j++;
			 	String s8 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='home_phone']")).sendKeys(s8);
			 	j++;
			 	String s9 =wb.getSheet(0).getCell(j,i).getContents();
			 	driver.findElement(By.xpath(".//*[@id='cell_phone']")).sendKeys(s9);
  
			 	driver.findElement(By.xpath("html/body/div[2]/form/div[10]/input")).click();
		 }
				driver.findElement(By.xpath("html/body/div[1]/a[1]")).click();
		}
	}


