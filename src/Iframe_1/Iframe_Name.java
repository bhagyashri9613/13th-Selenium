package Iframe_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Name {

	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			Thread.sleep(5000);
		
			
		    driver.switchTo().frame("iframeResult");
			
			
			driver.findElement(By.xpath("//button[@type='button']")).click();

		
		  
		
		
		}

}
