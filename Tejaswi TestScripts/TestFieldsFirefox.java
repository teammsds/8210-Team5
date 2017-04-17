package Tejaswi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFieldsFirefox {

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
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[7]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='f_number']")).sendKeys("67");
		driver.findElement(By.xpath(".//*[@id='f_name']")).sendKeys("Johnson Pitch");
		driver.findElement(By.xpath(".//*[@id='f_street']")).sendKeys("989 N");
		driver.findElement(By.xpath(".//*[@id='f_city']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='f_state']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='f_zip']")).sendKeys("67898");
		driver.findElement(By.xpath(".//*[@id='f_oworg']")).sendKeys("Berkly");
		driver.findElement(By.xpath(".//*[@id='f_conname']")).sendKeys("Berks Pichard");
		driver.findElement(By.xpath(".//*[@id='f_conemail']")).sendKeys("berk@gmail.com");
		driver.findElement(By.xpath(".//*[@id='f_conphone']")).sendKeys("7654786543");
		driver.findElement(By.xpath(".//*[@id='f_notes']")).sendKeys("This is a Berks Organization Field");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[12]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[5]/td[9]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[5]/td[10]/a")).click();
		driver.findElement(By.xpath(".//*[@id='f_conemail']")).clear();
		driver.findElement(By.xpath(".//*[@id='f_conemail']")).sendKeys("berk123@gmail.com");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[11]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[5]/td[11]/form/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='f_number']")).sendKeys("67");
		driver.findElement(By.xpath(".//*[@id='f_name']")).sendKeys("Johnson Pitch");
		driver.findElement(By.xpath(".//*[@id='f_street']")).sendKeys("989 N");
		driver.findElement(By.xpath(".//*[@id='f_city']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='f_state']")).sendKeys("Missouri");
		driver.findElement(By.xpath(".//*[@id='f_zip']")).sendKeys("67898");
		driver.findElement(By.xpath(".//*[@id='f_oworg']")).sendKeys("Berkly");
		driver.findElement(By.xpath(".//*[@id='f_conname']")).sendKeys("Berks Pichard");
		driver.findElement(By.xpath(".//*[@id='f_conemail']")).sendKeys("berk@gmail.com");
		driver.findElement(By.xpath(".//*[@id='f_conphone']")).sendKeys("7654786543");
		driver.findElement(By.xpath(".//*[@id='f_notes']")).sendKeys("This is a Berks Organization Field");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[12]/input")).click();
		
	}

}
