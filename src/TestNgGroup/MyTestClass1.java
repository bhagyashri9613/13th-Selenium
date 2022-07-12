package TestNgGroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 {
	 @Test(groups = { "sanity"})
	  public void sun() 
	  {
	  Reporter.log("hii sunday is running sanity", true);
	  }


	  @Test
	  public void mon()
	  {
		  Reporter.log("hii monday", true);
	  }



	  @Test(groups = { "sanity"})
	  public void tue() 
	  {
		  Reporter.log("hii tue is running sanity", true);
	  }



	  @Test(groups = { "regression"})
	  public void wen() 
	  {
		  Reporter.log("hii  wens is running regression", true);
	  }


	  @Test (groups = { "regression"})
	  public void thu()
	  {
		  Reporter.log("hii   thu is running regression", true);
	  }


}
