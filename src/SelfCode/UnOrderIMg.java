package SelfCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderIMg {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			 driver.manage().window().maximize();
		     driver.get("https://www.google.co.in/");
			 Thread.sleep(2000);
			 driver.findElement(By.name("q")).sendKeys("rose");
		     Thread.sleep(1000);
			 List<WebElement> SerchRslt = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		     System.out.println(SerchRslt.size());
		     Thread.sleep(1000);
		      for(WebElement rv:SerchRslt)
		      {
		    	  System.out.println(rv.getText());
		      }
		      Thread.sleep(1500);
		     for(WebElement rs:SerchRslt) 
		     {
		    	String actualresult = rs.getText();
		        String expectrslt = "rose gold";
		    
		     if(actualresult.equals(expectrslt))
		     
		          {
		    	     rs.click();
		              break;
		            }
		     }
		     
		     Thread.sleep(1500);
		     driver.findElement(By.partialLinkText("Images")).click();
		     
		     Thread.sleep(1500);
		    List<WebElement> serchlist = driver.findElements(By.tagName("img")) ;
		     
		     System.out.println(serchlist.size());
		     Thread.sleep(3000);
		    for(WebElement rs:serchlist)
		    {
		    	System.out.println(rs.getText());
		    }
		     
	}

}
