package Misc_1Autosugg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWrk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		// how to find no of rows in table
       List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println(rows.size());
		
		// how to read all rows from table

		for( WebElement allrows:rows)
		
		{
			System.out.println(allrows.getText());
		}
		
		//how to find no of columns in table
		
		 List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
	
		 System.out.println(columns.size());
		 
		 // how to read header
		ListIterator<WebElement> header = columns.listIterator();
		
		while(header.hasNext())
			
		{
			System.out.println(header.next().getText());
		}
			
			
		 List<WebElement> trdata = driver.findElements(By.xpath("//table//tr[4]//td"));    //***********
	
		        Iterator<WebElement> tdit = trdata.iterator();
	          while(tdit.hasNext())
	
	      {
		          System.out.print(tdit.next().getText());
	     }
	    System.out.println();
	}

}
