package TestNgSoftAssertUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertuse {
  @Test
  public void MyMethod() {
 
	  String a="bhagyashri";
	  String b="Bhagyashri";
      
  SoftAssert soft =new SoftAssert();                       //to use soft assert we need to create object of SoftAssert class
  
  soft.assertNotEquals(a, b,"a&b values are  equal then tc is fail");
  //soft.assertEquals(a, b,"a&b values are not equal then tc is fail");
  
  soft.assertAll();
 }

  @Test

  public void MyMethod1() {


 boolean a =true;
 boolean b =true;

 SoftAssert sa= new SoftAssert();

 sa.assertTrue(b, "b value is false then tc is false");
// sa.assertFalse(b, "b value is true then tc is false");
 sa.assertAll();
 
  }
}
