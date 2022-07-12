package TestNgParllelAndSerial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
 

  @Test
  public void myMethod1() throws InterruptedException 
  {
  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
  

  }









}
