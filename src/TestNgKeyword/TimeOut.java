package TestNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut=100)
  
  public void d() throws InterruptedException       
  {
	 Thread.sleep(1000);             //this tc run within 100 then it is pass otherwise by default tc is falil
  Reporter.log("d is running",true);
  }
  @Test
  public void a() 
  {
  Reporter.log("a is running",true);
  }
  @Test
  public void v() 
  {
  Reporter.log("v is running",true);
 

  }












}
