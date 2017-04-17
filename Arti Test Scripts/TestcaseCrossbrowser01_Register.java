package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestcaseCrossbrowser01_Register {
	
		WebDriver driver;

		
		@Test
		@Parameters("browser")
		public void setup(String browser) throws Exception{
			//Check if parameter passed from TestNG is 'firefox'
			if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty("webdriver.gecko.driver","C:\\Selenium downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("http://localhost/MSA5/public");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[2]/a")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("Michell Kramer");
				driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("Micramer@unomaha.edu");
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
				
				driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[2]/a")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("Collin jobs");
				driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("cjobs@unomaha.edu");
			}
			
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
			
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[3]/div/input")).sendKeys("secret");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/input")).sendKeys("secret");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[5]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click();
		
		
}
}