package TestNGPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void myMethod() throws InterruptedException 
  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
  
       System.out.println("hii  method is running this is printing statement"   );
       Reporter.log("hii method is running this is reporter o/p 1");
       Reporter.log("hii method is running this is reporter o/p",true);
  
  }

  @Test
  public void myMethod1() throws InterruptedException 
  {
  Assert.fail();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
  

  }









}
