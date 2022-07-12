package SelfCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_2 {

	public static void main(String[] args) throws InterruptedException {
	
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			Thread.sleep(2000);
		//1. switch to focus on main page
			String op = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
			System.out.println(op);
		//2.switch to focus on main page to frame1
			driver.switchTo().frame("frame1");
			WebElement top = driver.findElement(By.tagName("input"));    //when id n text not found then tag name use
			top.click(); 
			top.sendKeys("iframe practice...");
		//3.switch focus frame1 to frame3	                            ========***nested frame so directly go outer to inner frame
			driver.switchTo().frame("frame3");
			driver.findElement(By.id("a")).click();
		    driver.switchTo().parentFrame();                              // child frame to immediate parent frame
		    top.click(); 
		    top.clear();
			top.sendKeys("frame practice...");    
		//4.switch to frame2	========1st go main page
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame2");
			WebElement dropdwn = driver.findElement(By.id("animals"));
			Select s= new Select(dropdwn);
			s.selectByValue("babycat");
		//5.switch focus on frame1	
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame1");
			top.click(); 
			top.clear();
			top.sendKeys("hello iframe...");
		//6.switch on main page focus
			driver.switchTo().defaultContent();
			String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
			System.out.println(text);
			
			
	}

}
