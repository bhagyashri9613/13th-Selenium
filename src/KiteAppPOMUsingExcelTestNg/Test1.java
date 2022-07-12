package KiteAppPOMUsingExcelTestNg;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends Base1 {
 
	home1 getopt;
  
 @BeforeMethod
  public void dashboard()  
  {
	
  getopt =new home1(driver);
  getopt.SendshareNM("TATACOFFEE");
  }
@Test
public void getoutput()
{
	 getopt.getMultioption();


}
}