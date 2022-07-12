package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  Thread.sleep(5000);
		 
		  WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
		  WebElement destination = driver.findElement(By.id("amt8"));
		  //How to drag and drop using Actions class
		//create object of ACtions class and pass driver object
		
		Actions act=new Actions(driver);
		 Thread.sleep(2000);
		act.dragAndDrop(source, destination).build().perform();
	}

}
