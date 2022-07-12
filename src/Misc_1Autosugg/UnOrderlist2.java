package Misc_1Autosugg;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderlist2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.co.in/");
	  Thread.sleep(2000);
	  driver.findElement(By.name("q")).sendKeys("mobile");
	  Thread.sleep(5000);
	  List<WebElement> orderlst = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
      Thread.sleep(3000);
	  System.out.println(orderlst.size());
	
	  Iterator<WebElement> listit = orderlst.iterator();
	
	while(listit.hasNext())
	
	{
		System.out.println(listit.next().getText());
	}
	
	 Thread.sleep(5000);
	for(WebElement ls:orderlst)
	{
		String acualResult = ls.getText();
	    String expectedResult = "mobile watch";
	
	if( acualResult.equals(expectedResult))
	{
		ls.click();
		break;
	}
	
	
	
	
	}

	}
}
