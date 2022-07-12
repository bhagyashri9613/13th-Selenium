package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		//Find Element
		 WebElement textBox = driver.findElement(By.id("autocomplete"));
	     //How to send keys using Actions Class
		//Create object of Actions class and pass driver object
		Actions act = new Actions(driver);
		
		// using sendKeys method of actions class perform SendKeys task
		act.sendKeys(textBox, "hii velocity").perform();
			
		//How to handle drop down using Actions Class

	   WebElement dropdawn = driver.findElement(By.id("dropdown-class-example"));
	 
	   //using actions class method Handle drop down
	   act.click(dropdawn ).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();




	}

}
