package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 Thread.sleep(5000);
		 WebElement seleniumButton = driver.findElement(By.linkText("Selenium")) ;       // seleniumButton.click();--> using WebElement method
		// How to click using Actions class
		// Create object of Actions class and pass driver object
		 Actions act= new Actions(driver);
		// act.moveToElement(seleniumButton).perform();
		
		 // act.click().perform();
		//1. act.moveToElement(seleniumButton).click().build().perform();
	       act.click(seleniumButton).perform();
	
	
	    //2. How to right click(contextClick)using actions class
	     WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	     act.contextClick(rightClickButton).perform();
	     
	  //3. how to double click using Actions class
	     WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	     act.doubleClick(doubleClickButton).perform();
	
	
	
	

	}

}
