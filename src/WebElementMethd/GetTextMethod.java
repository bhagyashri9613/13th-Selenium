package WebElementMethd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
     WebDriver driver =new ChromeDriver();
    driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//1.		
      System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
	
    
    //2.
      
     String text =driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	System.out.println(text);
	
	//3.
	
	WebElement element = driver.findElement(By.xpath("//a[text()='Velocity Corporate  Center']"));
			
			System.out.println(element.getText());
	
	
	
		

	}

}
