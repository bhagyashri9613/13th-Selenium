package TestNGPrac;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void  ValidateUserId() 
  {
     Reporter.log("User id validate", true);
  
  }
@Test
public void ValidateDashboard()

 {
	Reporter.log("User Dashboard validate", true);
 }

@BeforeMethod
public void LoginToKiteApp()
 {
	Reporter.log("Login suucess",true);
 }

@BeforeClass

public void LaunchBrowser()
  {
	Reporter.log("UserLaunch Brawser",true);
  }

@AfterMethod

public void logoutFromKiteApp()
{
	Reporter.log("logging out",true);
}

@AfterClass
public void CloseBrowser()
{
	Reporter.log("broserclosed",true);
}

}
