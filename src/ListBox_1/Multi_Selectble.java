package ListBox_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectble {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://demoqa.com/select-menu");
	     Thread.sleep(2000);
 	
	     
	
	
	    WebElement car=driver.findElement(By.name("cars"));
	    Select s =new Select(car);
	
	    System.out.println("multi select status is"+s.isMultiple());
	    
	    s.selectByVisibleText("Volvo");
	     Thread.sleep(200);
	     s.selectByIndex(2);
	     Thread.sleep(200);
	     s.selectByValue("audi");
	     Thread.sleep(200);
	    
	   // s.deselectAll(); 
	     
	    
	     s.deselectByValue("audi");
	     Thread.sleep(200);
	     s.deselectByIndex(2);
	     Thread.sleep(200);
	     s.deselectByVisibleText("Volvo");
	     Thread.sleep(200);
	
	// System.out.println(s.getFirstSelectedOption());
	 
	      //Thread.sleep(5000);
       // s.getAllSelectedOptions();
        //Thread.sleep(5000);
    List<WebElement> selectall = driver.findElements(By.xpath("(//select)[2]//option"));
	System.out.println(selectall.size());
	 
	List<WebElement> se = s.getAllSelectedOptions();
	
	for(WebElement select:se)
	{
		System.out.println(select.getText());
	}
	
	// WebElement box=driver.findElement(By.id("oldSelectMenu"));
	 	
		   //   Select colur =new Select(box);
		
		  //  System.out.println("multi select status is"+colur.isMultiple());
		
	

	}

}
