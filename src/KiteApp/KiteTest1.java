package KiteApp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		Thread.sleep(2000); 
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	    Thread.sleep(1000);
	    UserId.sendKeys("ELR321");
	    Thread.sleep(200);
	    Password.sendKeys("Dhana1111");
	    Login.click();
	    Thread.sleep(2000);
	    
	    WebElement Pin = driver.findElement(By.id("pin"));
	    WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
	    Thread.sleep(1000);
	
	    Pin.sendKeys("982278");
        Continue.click();
        Thread.sleep(2000);
        WebElement UserNm = driver.findElement(By.xpath("//span[@class='user-id']"));
	    System.out.println(UserNm .getText());   
	     String ActualUserId = UserNm .getText();
	     String ExpectedUserId="ELR321";
	     if(ActualUserId.equals(ExpectedUserId))
	
	     {
	    	 System.out.println("User ID matching TC is PASSED");
	     }
	
	     else 
	     {
	    	System.out.println("User ID not matching TC is FAILED"); 
	     }
	     //  Thread.sleep(200);
	      //   driver.close();
	
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ioc");
	    
	      Thread.sleep(1000);
	       List<WebElement> searchbox = driver.findElements(By.xpath(" //ul[@class='omnisearch-results']//li" )); 
	
	    Thread.sleep(3000);
	     System.out.println(searchbox .size());
	    Iterator<WebElement> text = searchbox.iterator() ;
	   
	    while(text.hasNext())
	
	  {
		 System.out.println(text.next().getText()); 
	  }
	
	   for(Object res:searchbox)
	   {
		  Thread.sleep(2000);
	    
	     
	   }
	}

}
