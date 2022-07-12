package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener  implements ITestListener {



@Override
public void onTestSuccess(ITestResult result) 
{
	Reporter.log("welcome tc is pass tc name is "+result.getName(),true);
	
}

@Override
public void onTestSkipped(ITestResult result) 
{
 Reporter.log(" tc is skipped Check tc name is"+result.getName(),true);;
}
@Override
	public void onTestFailure(ITestResult result) 
{
	Reporter.log("tc is failed check method tc name is"+result.getName(), true);	
}








}
