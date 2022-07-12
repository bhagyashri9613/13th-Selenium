package TestNgVerificationByhardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class VerificationBySeleniumVsTesng {
  @Test
  public void f() {
 

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			 
		    WebElement checkbox2 = driver.findElement(By.name("checkBoxOption2"));
  
         // if(checkbox2.isSelected())
              
	         
        	//Reporter.log  ("checkbox is selected then tc is pass",true);
                     
  
        //  else
      //  {
         // Reporter.log   ("checkbox is notselected then tc is fail",true);
        // }
 
            Assert.assertTrue(checkbox2.isSelected(),"tc is pass");
  
  
 }
}
