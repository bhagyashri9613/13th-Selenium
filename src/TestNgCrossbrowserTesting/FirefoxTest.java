package TestNgCrossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void firefox() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\mozila\\geckodriver.exe");
		
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	 driver.get("https://vctcpune.com/selenium/practice.html");
  
  
  
  
  
  
  
  
  }
}
