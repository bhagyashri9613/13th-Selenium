package KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner.Listener.class)   //call listner with package name &.class

public class validteUserIdUsingPrpr extends kitebaseNew{
  
KiteHomePage home;
KiteLoginPage login;
KitePinPage pin;


@BeforeClass
 public void LaunchBrowser() throws Exception   {
	OpenBrowser();
 login =new KiteLoginPage(driver);
 pin =new KitePinPage(driver);
 home=new KiteHomePage(driver);
				
}
  
 @BeforeMethod 
 public  void loginToKiteApp() throws IOException {
  
  login.userSendKey(KITUTILITY.DataFromPropertieFile("UN"));
  
  login.SendPassword(KITUTILITY.DataFromPropertieFile("PWD"));
  
  login.clickOnLoginButton();
  pin.sendpin(KITUTILITY.DataFromPropertieFile("PIN"));
  pin.clickOncontinueutton();
  
}
  @ Test
  public void validateUserID() throws IOException
  {Assert.fail();
	  Assert.assertEquals(home.GetacualUsername(), KITUTILITY.DataFromPropertieFile("UN"));
	 
	 // KITUTILITY.CaptureScreenShot(driver, TCID);
  
 
  }
@AfterMethod
void logOutFromKite() throws InterruptedException
  {
	  home.logOut();
  }

@AfterClass

public void closeBrowser()

{
	driver.close();
}







}
















