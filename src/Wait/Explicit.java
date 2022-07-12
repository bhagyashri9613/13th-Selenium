 package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
	    WebElement aboutus = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(30000) );
	    wait.until(ExpectedConditions.visibilityOf(aboutus));
	    aboutus.click();
	  
	
	
	}

}
