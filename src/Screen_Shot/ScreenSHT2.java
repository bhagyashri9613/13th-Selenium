package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenSHT2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

         String str = RandomString.make(4);
        
        
        File destination =new File ("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\ randomaaacsh "+str+".png");

        FileHandler.copy(source, destination);




	}

}
