import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExample {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\JUnitExample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String t = driver.getTitle();
		System.out.println(t);
		Assert.assertTrue(t.contains("Facebook"));
		
	}
	
	@Test
	public void tC1() {
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("suman.krish23@gmail.com");
		
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		Assert.assertEquals("suman.krish23", attribute);
		
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Pravs@123");
		
	}
	
	@Test
	public void tC2() {
		WebElement user=driver.findElement(By.xpath("//input[@value='Log In']"));
		user.click();
		
	}
	
	@Before
	public void start() {
		Date d=new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yy hh-mm-mmm");
		
		String date=sdf.format(d);
		
		System.out.println("start Time   "+date);
		
		
		
	}
	
	@After
	public void end() {
		Date d=new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yy hh-mm-mmm");
		
		String date=sdf.format(d);
		
		System.out.println("End Time  "+date);
		
		
		
	}
	
	@AfterClass
	public  static void quit() {
		driver.quit();//to quit browser and instance
	}

	

}
