package SelfCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
	//1. main page
		 driver.findElement(By.id("name")).sendKeys("shri");
		    
	//2.switch main page to frame1
		 driver.switchTo().frame("frm1");
		 WebElement lang = driver.findElement(By.id("course"));
		 Select s1= new Select(lang);
		 s1.selectByVisibleText("Python");
	 //3.switch frame1 to main and main to frame2
		  driver.switchTo().parentFrame();
		  driver.switchTo().frame("frm2");
		  driver.findElement(By.id("firstName")).sendKeys("bhagyashri");
		  driver.findElement(By.id("lastName")).sendKeys("Patil");
	//4.switch frame2 to main n main to frame3
		driver.switchTo().defaultContent();
		 driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("frame3");
		
		
		
	}

}
