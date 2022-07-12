package KiteAppPOMUsingExcelTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserNm {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void  launchbrowser() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	login =new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home =new KiteHomePage(driver);

	}
	
	@BeforeMethod
	public void LoginToKite() throws EncryptedDocumentException, IOException {
	File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
	mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	String UI = mySheet.getRow(4).getCell(0).getStringCellValue();
	String PW = mySheet.getRow(4).getCell(1).getStringCellValue();
	String Pn = mySheet.getRow(4).getCell(2).getStringCellValue();
	
	 login.userSendKey(UI);
	 Reporter.log("sending username", true);
	 login.SendPassword(PW);
	 Reporter.log("sending password", true);
	 
	 Assert.assertTrue(login.selected(),"login button is not selected then Tc is fail");
	Reporter.log("login button is display TC is pass",true);
	 
	 login.clickOnLoginButton();
	
	 Reporter.log("click on loginbutton", true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 
	 pin.sendpin(Pn);
	 Reporter.log("sending pin", true);
	 
	 pin.clickOncontinueutton();
	 Reporter.log("click on continuebutton", true);
	}
	@Test
	public void ValidateUserName()
	{  
	String ExpectedResult = mySheet.getRow(4).getCell(0).getStringCellValue();
	String ActualResult =home.GetacualUsername();
	Reporter.log("validate ActualResult& expectedresult are matching tc are passed",true);
	}

	//@AfterMethod  	
	//public void logoutFromKiteApp() throws InterruptedException
	//{
	// home.logOut();
	// Reporter.log("logout kite app", true);
	//Thread.sleep(2000);
	//}
	
	@Test
	  public void dashboard()  
	  { 
		String ShNm=mySheet.getRow(5).getCell(0).getStringCellValue();	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
		home.SendshareNM(ShNm);
	  }
	@Test
	
	public void getlist()

	{ driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		home.getMultioption();
	}
	@Test
	public void validateshNM()
	{
	home.getactualShare("TATACOFFEE");
	}









}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

