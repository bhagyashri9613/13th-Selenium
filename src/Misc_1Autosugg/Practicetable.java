package Misc_1Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		// how to find no of rows in table	
	List<WebElement> totalrow = driver.findElements(By.xpath("//table//tr"));
	System.out.println(totalrow.size());
	Thread.sleep(2000);
	List<WebElement> totalheader = driver.findElements(By.xpath("//table//tr[1]//th"));
   System.out.println(totalheader.size());
	
	for(WebElement readrow:totalrow )
	{
		System.out.println(readrow.getText());
	}
	
	for(WebElement reatotalheader:totalheader )
	{
		System.out.println(reatotalheader.getText());
	}
	
	}

}
