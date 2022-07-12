package FbAppPOm;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/create/");
		
    File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
    String UI = mysheet.getRow(4).getCell(1).getStringCellValue();
    String PW = mysheet.getRow(4).getCell(2).getStringCellValue();
  
    System.out.println(UI);
	LogPg lp =new LogPg(driver);
	lp.SendEM(UI);
	lp.SendId(PW);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
