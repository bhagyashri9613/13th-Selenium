package POpups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
	//** main page id
	    String MainPgId = driver.getWindowHandle();
	    System.out.println(MainPgId);
        System.out.println("==========================================");
        //to open child window
        driver.findElement(By.xpath("//input[@value='New Window']")).click();
	 
        //********to handle multiple windows/ to get multiple id s
       Set<String> AllPageIDs = driver.getWindowHandles();                    	// System.out.println( AllPageIDs);

       Iterator<String> itr = AllPageIDs.iterator();
      
	      String MainpgID = itr.next();   //will return main page id
          String ChildPgID = itr.next(); //will return child page id
	      driver.switchTo().window(ChildPgID );// changing focus from main page to  child page
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
	     driver.close();
	      driver.switchTo().window(MainpgID);
	
	}

}
