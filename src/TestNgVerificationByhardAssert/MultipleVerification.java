package TestNgVerificationByhardAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void mymethod() {

  String a="shri";
 
  String b="shri";
  
  Assert.assertNotNull(a, b);
  Assert.assertNotEquals(a, b);
  
  
  
  }
}