package Misc_1Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.co.in/");
	 Thread.sleep(2000);
     driver.findElement(By.name("q")).sendKeys("honda");
	 Thread.sleep(500);
	 
	 List<WebElement> Searchlst = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
      System.out.println(Searchlst.size());
      for( WebElement sr:Searchlst)
          {
	         System.out.println(sr.getText()); // for required result only
          }
	     
	     for(WebElement result:Searchlst)// for clicking on required result
          {
           String actualText = result.getText();
           String expectedText = "honda amaze";
        if(actualText.equals(expectedText))
           { result.click();
               break;
             }
         }
         Thread.sleep(1000);
         driver.findElement(By.partialLinkText("Images")).click();
         Thread.sleep(1500);
         List<WebElement> Search = driver.findElements(By.tagName("img"));
         {
        	 System.out.println(Search.size());
         }
	}

}
