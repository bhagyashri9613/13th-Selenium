package WebElementMethd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(1000);
	    
		 
		 WebElement textbox = driver.findElement(By.id("name"));
	
	     WebElement hide = driver.findElement(By.id("hide-textbox"));
	
	     driver.findElement(By.id("show-textbox"));
	
	
	if(textbox.isDisplayed())
	{
		System.out.println("Thank you text box is displayed");
	}
	
	else
	{
	   System.out.println("box cant find");
	}
	
	hide.click();
	
	if(textbox.isDisplayed())
	{
		System.out.println("Thank you text box is displayed");
	}
	
	else
	{
	   System.out.println("box cant find");
	}
	
	
	
	
	
	
	

	}

}
