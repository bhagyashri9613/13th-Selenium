package SelfCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		  Thread.sleep(2000);
	      driver.findElement(By.id("alertBox")).click();
	      Thread.sleep(1000);
	      Alert alt = driver.switchTo().alert();
		  System.out.println(alt.getText());
		  alt.accept();
		
		  driver.findElement(By.id("confirmBox")).click();
		  Thread.sleep(1000);
		  Alert alt1 = driver.switchTo().alert();
		  System.out.println(alt1.getText());
		  alt1.dismiss();
		
		driver.findElement(By.id("promptBox")).click();
		 Thread.sleep(1000);
		 Alert alt3 = driver.switchTo().alert();
		 System.out.println(alt3.getText());
		 alt3.sendKeys("amarshri");
		 Thread.sleep(2000);
		 alt3.accept();
	}

}
