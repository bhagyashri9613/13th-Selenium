package TestNgVerificationByhardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void mymethod() {
 
  String a=null;
  String b ="abc";
  
 // Assert.assertNull(a,"a is not null then tc is pass");
  //Reporter.log("a is true then test case is passed", true);
 
  Assert.assertNotNull(b,"b is null then tc is ");
  Reporter.log("b is not null then tc is pass", true);
 
  
  
  }
}
