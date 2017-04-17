package Testing;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestingTeamsPage {

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
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")).click();
		
		Select s1 = new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")));
		s1.selectByIndex(0);
		
		driver.findElement(By.xpath(".//*[@id='tm_number']")).sendKeys("5");
		driver.findElement(By.xpath(".//*[@id='tm_name']")).sendKeys("School 1 Team 3");
		driver.findElement(By.xpath(".//*[@id='tm_coach']")).sendKeys("School 1 Coach 3");
		driver.findElement(By.xpath(".//*[@id='tm_coachemail']")).sendKeys("s1c3@unomaha.edu");
		driver.findElement(By.xpath(".//*[@id='tm_coachphone']")).sendKeys("4023695412");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[7]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[2]/td[7]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[5]/td[8]/a")).click();
		driver.findElement(By.xpath(".//*[@id='team_coachphone']")).clear();
		driver.findElement(By.xpath(".//*[@id='team_coachphone']")).sendKeys("40235");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[6]/input")).click();
	
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[5]/td[9]/form/input[3]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click(); 
	}

}
