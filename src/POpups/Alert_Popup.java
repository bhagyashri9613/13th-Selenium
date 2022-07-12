package POpups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);

	    
//1. To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
	
//2. Alert is an interface which contains abstract methods like:
	
	// 1. accept(): use to click on ok button.
	// 2. dismiss(): use to click on cancel button.
	// 3. getText(): use to get text present in a alert popup
	  
	   driver.findElement(By.id("alertButton")).click();
      Alert alt = driver.switchTo().alert();
	   System.out.println(alt.getText());
	 alt.accept();    //click on ok button
	  
	   
	}

}
