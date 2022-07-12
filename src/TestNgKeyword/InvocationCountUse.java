package TestNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  
 
	  @Test(invocationCount = 3)
	  public void myTest() 
	  {
	     Reporter.log("Hello",true);
	  }
	  
	  @Test(invocationCount =5 )
	  public void test()
	  {
	  Reporter.log("Hi",true);  
      }
}
