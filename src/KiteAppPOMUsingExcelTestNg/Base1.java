package KiteAppPOMUsingExcelTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {

	 protected WebDriver driver;

	public void opnenBrowser() throws InterruptedException
	
	{
	
	 System.setProperty("webdriver.chrome. driver","C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.get("https://kite.zerodha.com/dashboard");
	
	
	}

}
