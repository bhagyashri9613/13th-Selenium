package KiteSeprateClassUingEX_BS_UT_TSTNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteAppPOMUsingExcelTestNg.KiteHomePage;
import KiteAppPOMUsingExcelTestNg.KiteLoginPage;
import KiteAppPOMUsingExcelTestNg.KitePinPage;
import KiteSeprateClassUingEX_BS_UT_TSTNG.Base;

public class validateKiteUserNm extends Base {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
    String TCID ="100";
    String TCID1 ="100";
  @Parameters("browserName")
    @BeforeClass                        //kite cross Browsertestng.xml
public void launchBrowser(@Optional String name)	
{

if(name.equals("chrome"))
{
	openchromebrowser();
}
else if(name.equals("firefox"))
{
	firefoxbrowser();
}

login =new KiteLoginPage(driver);
pin=new KitePinPage(driver);
home=new KiteHomePage(driver);
}

@BeforeMethod	
public void kitelogin() throws EncryptedDocumentException, IOException	
{
	
login.userSendKey(Utility.ReaddatafromExcel(4, 0));	
login.SendPassword(Utility.ReaddatafromExcel(4, 1));
login.clickOnLoginButton();


driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

pin.sendpin(Utility.ReaddatafromExcel(4, 2));	
Utility.capturescreenShot(driver, TCID1);
pin.clickOncontinueutton();	
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

}
@Test
public void validateUserId() throws EncryptedDocumentException, IOException
{
	Assert.assertEquals(home.GetacualUsername(),Utility.ReaddatafromExcel(4, 0));

	Utility.capturescreenShot(driver, TCID);

}
@AfterMethod
public void kiteLogOut() throws InterruptedException
{
 home.logOut();
Thread.sleep(2000);
}
@AfterClass
public void closebrowser()
{
	driver.close();
}
}
