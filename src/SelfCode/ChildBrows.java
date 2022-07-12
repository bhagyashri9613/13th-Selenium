package SelfCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrows {

	public static void main(String[] args) throws InterruptedException  {
	
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		      WebDriver driver= new ChromeDriver();
		      driver.manage().window().maximize();
			  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			  Thread.sleep(2000);
	}

}
