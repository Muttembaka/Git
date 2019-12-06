import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class FacebookWithTestcases extends Helper {
	/*public static void main(String args[]) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.krish23@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@123");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		
		//WebElement pass=driver.findElement(By.id("pass"));
	}*/
	@BeforeClass
	public static void load() {
		launchBrowser();
	}
	
	@Test
	public void TestCase1()  {//valid
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.krish23@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@123");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals("Facebook", actual);
		//driver.close();
		
	}
	
	@Test
	public void TestCase2()  {//invalid-user,valid-pass
		
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.kr@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@123");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
	}
	
	
	@Test
	public void TestCase3() {//both invalid
		
		//load();
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.krish@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@12");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
	}
	
	@Test
	public void TestCase4() {
		//load();
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.krish@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@12");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
	    Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
	}
	
	@Test
	public void TestCase5() {
		//load();
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
		
	}
	
	@Test
	public void TestCase6() {
		//load();
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"suman.krish@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
		
	}
	
	@Test
	public void TestCase7() {
		//load();
		launchUrl("https://www.facebook.com/");

		WebElement user=driver.findElement(By.id("email"));
		passSendkeyValue(user,"");
		WebElement pass=driver.findElement(By.id("pass"));
		passSendkeyValue(pass,"Pravs@12");
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		button(btn);
		String actual=driver.getTitle();
		Assert.assertEquals("Log in to Facebook | Facebook", actual);
		//driver.close();
		
	}
	@Before
	public void start() {
		Date d=new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yy hh-mm-mmm");
		
		String date=sdf.format(d);
		
		System.out.println("start Time   "+date);}
	
	@After
	public void end() {
		Date d=new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yy hh-mm-mmm");
		
		String date=sdf.format(d);
		
		System.out.println("End Time   "+date);}
	@AfterClass
	public static void quit() {
		driver.quit();
	}

}
