package ListBox_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbListBox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com");
		 Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shri");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kadam");
	 	
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9527129339");
		 	
	     driver.findElement(By.id("password_step_input")).sendKeys("Shri@1234");
	     Thread.sleep(5000);
	
	     WebElement date = driver.findElement(By.id("day"));
	     
	     //1.by value method
	    
	     Select s= new Select(date);
	     
	     s.selectByValue("13");
	    
	     //2.by class method
	
	    WebElement month = driver.findElement(By.id("month")); 
	     
	    Select s1 =new Select(month);
	    s1.selectByIndex(1);
	    		 
	    //3.by index method		 
	
	    WebElement year =driver.findElement(By.id("year"));
	     
	    Select  s3 =new Select( year);
	       s3.selectByVisibleText("1993");
	
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	    Thread.sleep(2000);
	}

}
