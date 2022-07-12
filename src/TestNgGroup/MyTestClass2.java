package TestNgGroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test(groups = { "sanity"})
  public void goodmoring() 
  {
  Reporter.log("hii   morning is running sanity", true);
  }


  @Test(groups = { "regression"})
  public void afternoon()
  {
	  Reporter.log("hii afternoon is running regression", true);
  }



  @Test(groups = { "sanity"})
  public void goodevening() 
  {
	  Reporter.log("hii  evening is running sanity", true);
  }



  @Test(groups = { "regression"})
  public void goodnignt() 
  {
	  Reporter.log("hii  nignht is running regression", true);
  }


  @Test(groups = { "sanity"})
  public void midnight()
  {
	  Reporter.log("hii   midnignt is running sanity", true);
  }








}
