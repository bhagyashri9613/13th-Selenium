package KiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	    
	    String UI = mysheet.getRow(4).getCell(0).getStringCellValue();
		String PW = mysheet.getRow(4).getCell(1).getStringCellValue();
	    String Pn = mysheet.getRow(4).getCell(2).getStringCellValue();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		Thread.sleep(2000); 
	
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	    Thread.sleep(1000);
	    UserId.sendKeys(UI);
	
	    Password.sendKeys(PW);
	    Login.click();
	    Thread.sleep(2000);
	    
	    WebElement Pin = driver.findElement(By.id("pin"));
	    WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
	    Thread.sleep(1000);
	
	    Pin.sendKeys( Pn);
        Continue.click();
        Thread.sleep(2000);
       
        WebElement UserNm = driver.findElement(By.xpath("//span[@class='user-id']"));
	    System.out.println(UserNm .getText());   
	     String ActualUserId = UserNm .getText();
	     String ExpectedUserId=UI;
	     if(ActualUserId.equals(ExpectedUserId))
	
	     {
	    	 System.out.println("User ID matching TC is PASSED");
	     }
	
	     else 
	     {
	    	System.out.println("User ID not matching TC is FAILED"); 
	     }
	       Thread.sleep(200);
	         driver.close();
	}	

	}


