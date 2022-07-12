package TestNgVerificationByhardAssert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertequal {
  @Test
  public void Mymethod()
  {
 String name="Bhagyashri";
 String name1="Bhagyashri";

  Assert.assertEquals(name1, name, "name1 &name are not equals then test case is failed");
  Reporter.log("name &name1 are equal test case is passed", true);
 // Assert.assertNotEquals(name1, name, "name1 & name2 are  equal then test case is fail");          next tc skip hote            
  
  }
  
	  @Test
	  public void Mymethod1()
	  {
	 String name="Bhagyashri";
	 String name1="hri";

	  Assert.assertNotEquals(name1, name, "name1 &name are not equals then test case is passed");
	  Reporter.log("name &name1 are notequal test case is passed", true);
	  
	  }




}
