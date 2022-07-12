package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MylistnerClass1 {


	@Test

	public void TC5() 

	{
		  Reporter.log("TC5 Running",true);
	}
	@Test
	public void TC6() 

	{
		  Reporter.log("TC6 Running",true);
	}
	@Test
	public void TC7() 

	{
		  Assert.fail();
		  Reporter.log("TC7 Running",true);
	}
	@Test(dependsOnMethods = "TC7")
	public void TC4() 

	{
		  Reporter.log("TC4 Running",true);
	}










}
