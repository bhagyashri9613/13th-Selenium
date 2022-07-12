package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		KiteLoginPage klp= new KiteLoginPage (driver);
	    klp.userSendKey();
	    klp.SendPassword();
	    klp.clickOnLoginButton();
	
	    KitePinPage kpp=new KitePinPage (driver);
	    kpp.sendpin();
	    kpp.clickOncontinueutton();
	   
	    KiteHomePage khp= new KiteHomePage(driver);
	    khp.validateUserName();
	    khp.logOut();
	    
	    
	
	
	
	
	
	}

}
