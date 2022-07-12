package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserTest {
	@Parameters("browserName")
	@Test
  public void f(String name) throws InterruptedException {
  
	 WebDriver driver=null;
		
		
		if(name.equals("firefox"))
		{	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\mozila\\geckodriver.exe");
		
	   driver = new FirefoxDriver();
  
		}
		else if(name.equals("chrome"))
  
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromeDr\\chromedriver.exe");
			driver =new ChromeDriver();
		}
  
        driver.manage().window().maximize();
       Thread.sleep(2000);
          driver.close();
  }
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

