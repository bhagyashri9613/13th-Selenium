package SelfCode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SS_LSTBX_CHLDBRWS {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver =new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.get("https://skpatro.github.io/demo/links/");
		   Thread.sleep(2000);
		
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
       File dest= new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\screen.png");
	
	      FileHandler.copy(source, dest);
	
	
	     driver.get("https://demoqa.com/select-menu");
       WebElement dd = driver.findElement(By.id("cars"));
       Thread.sleep(2000);
       Select s=new Select(dd);
       Thread.sleep(2000);
       s.selectByVisibleText("Saab");
       Thread.sleep(1000);
       s.selectByValue("volvo");
       Thread.sleep(1000);
       s.selectByIndex(2);
       Thread.sleep(1000);
      
     // Alert alt = driver.switchTo().alert();
      
      // alt.accept();
     //  alt.dismiss();
	
      
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
      String MPID = driver.getWindowHandle();
	   driver.findElement(By.name("NewWindow")).click();
      Set<String> ALLPID = driver.getWindowHandles();
	 
	    ArrayList BR =new ArrayList (ALLPID);
		System.out.println(BR.get(0));  //main page id
		System.out.println(BR.get(1));  // child page id
		Object ID = BR.get(1);
		driver.switchTo().window((String) ID);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("practice of child browser");
	
	}

}
