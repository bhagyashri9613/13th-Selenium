package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenSHT1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//File destination =new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\practicePage.png");
		FileHandler.copy(source, new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\practicePage.png"));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://web.whatsapp.com");
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\wp "+".png" );
		 
		FileHandler.copy(src, dest);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des =new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\fb"+".png");
		 
		FileHandler.copy(sr, des);
		

	}

}
