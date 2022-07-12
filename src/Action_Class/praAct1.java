package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class praAct1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.co.in/");
		  Thread.sleep(2000);
		  WebElement search = driver.findElement(By.name("q"));
	
		  Actions act =new Actions(driver );
	act.sendKeys(search,"beach").click().build().perform();
	
	}

}
