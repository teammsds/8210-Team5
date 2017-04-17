package Tejaswi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://msdmsag5.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("amukati@unomaha.edu");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("secret");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-navbar-collapse']/ul[1]/li/ul/li[8]/a")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		Select field=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")));
		field.selectByVisibleText("Johnson Pitch");
		Select tournament=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[2]/select")));
		tournament.selectByVisibleText("Missouri Soccer Association");
		Select team1=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[3]/select")));
		team1.selectByIndex(0);
		Select team2=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[4]/select")));
		team2.selectByIndex(1);
		Select referee1=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[5]/select")));
		referee1.selectByVisibleText("Referee 2");
		Select referee2=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[6]/select")));
		referee2.selectByVisibleText("James");
		driver.findElement(By.xpath(".//*[@id='m_number']")).sendKeys("13");
		driver.findElement(By.xpath(".//*[@id='m_date']")).sendKeys("2017-09-08");
		driver.findElement(By.xpath(".//*[@id='m_time']")).sendKeys("14:00");
		driver.findElement(By.xpath(".//*[@id='m_score']")).sendKeys("7-9");
		driver.findElement(By.xpath(".//*[@id='m_ref_com']")).sendKeys("Overall a good match");
		driver.findElement(By.xpath(".//*[@id='m_homeg']")).sendKeys("7");
		driver.findElement(By.xpath(".//*[@id='m_guestg']")).sendKeys("9");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[14]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[8]/td[14]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[8]/td[15]/a")).click();
		driver.findElement(By.xpath(".//*[@id='m_time']")).clear();
		driver.findElement(By.xpath(".//*[@id='m_time']")).sendKeys("15:00");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[8]/input")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/table/tbody/tr[8]/td[16]/form/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/div/a")).click();
		Select field1=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[1]/select")));
		field1.selectByVisibleText("Johnson Pitch");
		Select tournament1=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[2]/select")));
		tournament1.selectByVisibleText("Missouri Soccer Association");
		Select team11=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[3]/select")));
		team11.selectByIndex(0);
		Select team21=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[4]/select")));
		team21.selectByIndex(1);
		Select referee11=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[5]/select")));
		referee11.selectByVisibleText("Referee 2");
		Select referee21=new Select(driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[6]/select")));
		referee21.selectByVisibleText("James");
		driver.findElement(By.xpath(".//*[@id='m_number']")).sendKeys("13");
		driver.findElement(By.xpath(".//*[@id='m_date']")).sendKeys("2017-09-08");
		driver.findElement(By.xpath(".//*[@id='m_time']")).sendKeys("14:00");
		driver.findElement(By.xpath(".//*[@id='m_score']")).sendKeys("7-9");
		driver.findElement(By.xpath(".//*[@id='m_ref_com']")).sendKeys("Overall a good match");
		driver.findElement(By.xpath(".//*[@id='m_homeg']")).sendKeys("7");
		driver.findElement(By.xpath(".//*[@id='m_guestg']")).sendKeys("9");
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div/div/form/div[14]/input")).click();
		
	}

}
