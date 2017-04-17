package automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestcaseCrossbrowser03_Roles {
WebDriver driver;

	
	@Test
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
		
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver","C:\\Selenium downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
			driver.get("http://localhost/MSA5/public");
			driver.manage().window().maximize();
//			//login by admin

//			driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right>li>a")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).clear();
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("button.btn.btn-primary")).click(); 
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
////			//Administration tab users link
			driver.findElement(By.linkText("Administration")).click();
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[1]/a")).click();


			driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("clerk");
			
			
			driver.findElement(By.xpath( ".//*[@id='display_name']")).sendKeys("Clerk");
			driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("read only");
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/span/span[1]/span/ul")).click();

			Select sel1=new Select(driver.findElement(By.name("permissionlist[]")));
					
			sel1.selectByVisibleText("Readonly");	
			
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
			Thread.sleep(10000);
			
			//update user		
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]/div/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/span/span[1]/span/ul")).click();
	//		driver.findElement(By.cssSelector(".select2-selection__choice__remove")).click();
		
			Select sel2=new Select(driver.findElement(By.name("permissionlist[]")));
			
			sel2.selectByVisibleText("Manage Users");	
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Delete 	
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]/div/a")).click();
		
//			Thread.sleep(5000);
//			driver.findElement(By.cssSelector("button[id=delete]")).click();
//			Thread.sleep(1000);
//			
		

							}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","C:\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.get("http://localhost/MSA5/public");
			driver.manage().window().maximize();
//			//login by admin

//			driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right>li>a")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).clear();
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("button.btn.btn-primary")).click(); 
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
////			//Administration tab users link
			driver.findElement(By.linkText("Administration")).click();
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[1]/a")).click();


			driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Employee");
			
			
			driver.findElement(By.xpath( ".//*[@id='display_name']")).sendKeys("employeee ");
			driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("match");
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/span/span[1]/span/ul")).click();

			Select sel1=new Select(driver.findElement(By.name("permissionlist[]")));
					
			sel1.selectByVisibleText("Readonly");	
			
			driver.findElement(By.xpath( ".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
			Thread.sleep(2000);
			
			//update user		
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]/div/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/span/span[1]/span/ul/li[1]/span")).click();
			driver.findElement(By.cssSelector(".select2-selection__choice__remove")).click();
		
			Select sel2=new Select(driver.findElement(By.name("permissionlist[]")));
			
			sel2.selectByVisibleText("Manage Users");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Delete 	
			driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/div/table/tbody/tr[6]/td[2]/div/a")).click();
		
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[id=delete]")).click();
			Thread.sleep(1000);
			
			
		


						
		}
		
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
}
}