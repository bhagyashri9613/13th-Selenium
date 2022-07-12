

package Iframe_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
				
			
			
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://skpatro.github.io/demo/iframes/");
				
				Thread.sleep(2000);

			 //  1. from main page
			     String text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		         System.out.println(text);
			
		    //2.switch focus from main page to frame1
				 driver.switchTo().frame(0);
			     String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		         System.out.println(text1);                            //no such element exception found cause text present in iframe
			
		   //3.switch focus from frame1 to main page       
			    driver.switchTo().parentFrame();
			    String text2= driver.findElement(By.linkText("Pavilion")).getText();
		        System.out.println(text2);
			
		   //4. switch focus from main page to frame2     
			     driver.switchTo().frame(1);
			     String text3= driver.findElement(By.xpath("//a[text()='Category3']")).getText();
			     System.out.println(text3);
				
		   //5. switch focus frame2  to frame1  
			     driver.switchTo().defaultContent();
			     String text4 = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
			     System.out.println(text4);
			
			     driver.switchTo().defaultContent();
			     
			     System.out.println("*****************************************");

	      List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
	       
	     for( WebElement es:totalframe)
	     {
	    	 System.out.println(es.getSize());
	     }
	
	
	}

}
