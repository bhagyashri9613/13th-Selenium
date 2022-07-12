package Selenium_Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSelenium_Code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driver =new ChromeDriver();
	   driver.get("https://vctcpune.com/selenium/practice.html");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("// input[@type='radio']")).click();
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello i am velocity!");
	   driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	   driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	   driver.findElement(By.xpath("//input [@placeholder='Enter Your Name']")).sendKeys("Bhagyashree kadam");
	   //driver.findElement(By.xpath("/h1[text()='Practice Page']")                     xpath for text
	   
	   driver.findElement(By.xpath("(//input[@name='radio']) [1]")).click();       // mulptile attribute type and name are same then use xpath-index
	   
	   driver.findElement(By.xpath("//h1[contains(text(),'Welcome ')] ")).click();   // link is big in size then not required whole text only mention substring
		
		
	}

}
