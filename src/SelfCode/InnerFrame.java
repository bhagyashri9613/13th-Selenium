package SelfCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver= new ChromeDriver();
			  driver.manage().window().maximize();
			 
			  Thread.sleep(2000);
			  driver.get("https://ui.vision/demo/webtest/frames/");
			  driver.switchTo().frame(0);
			  WebElement op1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
			  op1.click();
			  op1.sendKeys("shri patil");
				
			    driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				WebElement op2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
			    op2.sendKeys("hii... frame2");
			  
			    driver.switchTo().defaultContent();
				driver.switchTo().frame(2);
				WebElement op3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
			    op3.sendKeys("hello! frame3");
			    
			    driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			    Thread.sleep(2000);
			    WebElement op31 = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]"));
			    op31.click();
			    
			    driver.switchTo().defaultContent();
			    driver.switchTo().frame(3);
			    WebElement op4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
			    op4.sendKeys("hey... frame4");
			  
			    driver.switchTo().defaultContent();
			    driver.switchTo().frame(4);
			    WebElement op5 = driver.findElement(By.xpath("//input[@name='mytext5']"));
			    op5.sendKeys("hie... frame5");
	}

}
