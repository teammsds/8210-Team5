package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTestingSchoolPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","T:\\8210 ISQA - MSD\\Assignment 4\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://msdmsag5.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='s_name']")).sendKeys("School 3");
		driver.findElement(By.xpath(".//*[@id='s_number']")).sendKeys("3");
		driver.findElement(By.xpath(".//*[@id='s_street']")).sendKeys("70thStreet");
		driver.findElement(By.xpath(".//*[@id='s_city']")).sendKeys("Omaha");
		driver.findElement(By.xpath(".//*[@id='s_state']")).sendKeys("ne");
		driver.findElement(By.xpath(".//*[@id='s_zip']")).sendKeys("68452");
		driver.findElement(By.xpath(".//*[@id='s_contact']")).sendKeys("4023569874");
		driver.findElement(By.xpath(".//*[@id='s_email']")).sendKeys("umkx@umkx.edu");
		driver.findElement(By.xpath(".//*[@id='s_phone']")).sendKeys("4025789412");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[10]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[1]/td[10]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[3]/td[11]/a")).click();
		driver.findElement(By.xpath(".//*[@id='s_zip']")).clear();
		driver.findElement(By.xpath(".//*[@id='s_zip']")).sendKeys("69412");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[10]/input")).click();
	
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[3]/td[12]/form/input[3]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click();
	}

}
