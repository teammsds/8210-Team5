package Tejaswi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRefereesFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\cpacs\\Downloads\\geckodriver.exe");   
		WebDriver driver = new FirefoxDriver();
		driver.get("http://msdmsag5.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[10]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		Select referee1=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")));
		referee1.selectByVisibleText("paulr@gmail.com");
		driver.findElement(By.xpath(".//*[@id='r_number']")).sendKeys("17");
		driver.findElement(By.xpath(".//*[@id='r_fname']")).sendKeys("James");
		driver.findElement(By.xpath(".//*[@id='r_lname']")).sendKeys("Watson");
		driver.findElement(By.xpath(".//*[@id='r_street']")).sendKeys("South 78");
		driver.findElement(By.xpath(".//*[@id='r_city']")).sendKeys("Misre");
		driver.findElement(By.xpath(".//*[@id='r_state']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='r_zip']")).sendKeys("69878");
		driver.findElement(By.xpath(".//*[@id='r_phone']")).sendKeys("7896534565");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[10]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[3]/td[10]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[3]/td[11]/a")).click();
		driver.findElement(By.xpath(".//*[@id='r_phone']")).clear();
		driver.findElement(By.xpath(".//*[@id='r_phone']")).sendKeys("8896785645");
		driver.findElement(By.xpath(".//*[@id='app-layout']/form/div[9]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[3]/td[12]/form/input[3]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		Select referee2=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")));
		referee2.selectByVisibleText("paulr@gmail.com");
		driver.findElement(By.xpath(".//*[@id='r_number']")).sendKeys("17");
		driver.findElement(By.xpath(".//*[@id='r_fname']")).sendKeys("James");
		driver.findElement(By.xpath(".//*[@id='r_lname']")).sendKeys("Watson");
		driver.findElement(By.xpath(".//*[@id='r_street']")).sendKeys("South 78");
		driver.findElement(By.xpath(".//*[@id='r_city']")).sendKeys("Misre");
		driver.findElement(By.xpath(".//*[@id='r_state']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='r_zip']")).sendKeys("69878");
		driver.findElement(By.xpath(".//*[@id='r_phone']")).sendKeys("7896534565");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[10]/input")).click();
		
	}

}
