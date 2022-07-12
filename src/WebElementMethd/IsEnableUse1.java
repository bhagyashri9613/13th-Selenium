package WebElementMethd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		 Thread.sleep(5000);
		
		 
	//1.		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);

     //2.	
		
		
		//boolean Otpbutton = driver.findElement(By.xpath("// button [ text ()='Get OTP']")).isEnabled();
		WebElement Otpbutton = driver.findElement(By.xpath("// button [ text ()='Get OTP']"));
		
		System.out.println( Otpbutton.isEnabled());                                  //(without no)
	   
	//3.
	  
		driver.findElement(By.id("mobileNumber")).sendKeys("9527129339");
	   Thread.sleep(1000);                                                            // (with no)
	   
	   
	   
	   System.out.println( Otpbutton.isEnabled());
		
		Otpbutton.click();
	
	
		
	}

}
