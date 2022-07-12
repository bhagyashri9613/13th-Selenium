package SetPositionAndSetSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPOS {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(5000);	
		   System.out.println(driver.manage().window().getPosition());
			
		// to set position we need to create object of Point Class and pass X and Y coordinate

		     Point p= new Point(200, 10);
		// using SetPosition method we can set the browser position
		     Thread.sleep(5000);	
		     driver.manage().window().setPosition(p);
		     Thread.sleep(1000);	
		     driver.manage().window().minimize();


	}

}
