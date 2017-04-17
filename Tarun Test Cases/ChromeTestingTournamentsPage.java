package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestingTournamentsPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\8210 ISQA - MSD\\Assignment 4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://msdmsag5.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[9]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='to_number']")).sendKeys("2");
		driver.findElement(By.xpath(".//*[@id='to_name']")).sendKeys("Missouri Under 19");
		driver.findElement(By.xpath(".//*[@id='to_sdate']")).sendKeys("2016-06-06");
		driver.findElement(By.xpath(".//*[@id='to_edate']")).sendKeys("2016-07-07");
		driver.findElement(By.xpath(".//*[@id='to_totteams']")).sendKeys("11");
		driver.findElement(By.xpath(".//*[@id='to_cname']")).sendKeys("MSU19 Lead");
		driver.findElement(By.xpath(".//*[@id='to_cemail']")).sendKeys("msu19@msu.com");
		driver.findElement(By.xpath(".//*[@id='to_cphone']")).sendKeys("4023651234");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[9]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[1]/td[9]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[2]/td[10]/a")).click();
		driver.findElement(By.xpath(".//*[@id='to_totteams']")).clear();
		driver.findElement(By.xpath(".//*[@id='to_totteams']")).sendKeys("12");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[9]/input")).click();
	
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[2]/td[11]/form/input[3]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click();

	}

}
