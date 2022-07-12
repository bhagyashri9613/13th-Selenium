package TestNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class includeExclude2 {
  @Test
  public void m1()
  {
  Reporter.log("d is running",true);
  }
  @Test
  public void m2()
  {
  Reporter.log("a is running",true);
  }
  @Test
  public void m3()
  {
  Reporter.log("v is running",true);
  }
  @Test

  public void test() 
  {
	Reporter.log("hii this is test method", false);
  }


}
