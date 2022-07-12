package Misc_1Autosugg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);

         List<WebElement> LSTLNK = driver.findElements(By.tagName("a"));
         System.out.println(LSTLNK.size());
        
            Iterator<WebElement> it = LSTLNK.iterator();
	
	     while(it.hasNext())
	
	     {
	    	 System.out.println(it.next().getText());
	     }
	}

}
