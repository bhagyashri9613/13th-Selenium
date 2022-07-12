package Iframe_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/iframes/");
	Thread.sleep(1000);
	driver.switchTo().frame("Frame1");
	System.out.println (driver.findElement(By.id("frametext")).getText());
	
	}

}
