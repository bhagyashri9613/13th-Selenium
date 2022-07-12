package SetPositionAndSetSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(2000);	
		   
		   System.out.println(driver.manage().window().getSize());
	       Dimension size= new Dimension(500, 250);
	
	        driver.manage().window().setSize(size);
	}

}
