package TestNgVerificationByhardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void TrueMethod(){
 
  boolean a=true;
  boolean b= false;
  
 //Assert.assertTrue(a,"a is false then tc is false");
// Reporter.log("a is true then tc passed", true);
  
  
 Assert.assertFalse(b,"b is true then tc is pass");
 Reporter.log("b is false then tc passed", true);
  
  
  
  
  
  
  }
}
