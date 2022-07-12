package KiteusingNormalPomTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		//*******
		
		File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	    
	    String UI = mysheet.getRow(4).getCell(0).getStringCellValue();
		String PW = mysheet.getRow(4).getCell(1).getStringCellValue();
	    String Pn = mysheet.getRow(4).getCell(2).getStringCellValue();
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		KiteLoginPage klp= new KiteLoginPage (driver);
	    klp.userSendKey(UI);
	    klp.SendPassword( PW);
	    klp.clickOnLoginButton();
	    Thread.sleep(2000);
	    KitePinPage kpp=new KitePinPage (driver);
	    kpp.sendpin(Pn );
	    kpp.clickOncontinueutton();
	    Thread.sleep(2000);
	    KiteHomePage khp= new KiteHomePage(driver);
	    khp.validateUserName(UI);
	    khp.logOut();
	    
	    
	
	
	
	
	
	}

}
