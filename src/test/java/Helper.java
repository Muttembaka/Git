import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	static WebDriver driver;
	static Select s;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\JUnitExample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		
	}
	public static void  passSendkeyValue(WebElement e,String value) {
		e.sendKeys(value);
		
	}
	public static void  button(WebElement e) {
		e.click();
	}
	
}
