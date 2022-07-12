package KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener  implements ITestListener {
	
@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("check TC is pass Tc name is"+result.getName(), true);
	}


@Override
public void onTestFailure(ITestResult result) {
Reporter.log("check TC is Fail Tc name is"+result.getName(), true);
try {
	String TCN=result.getName();
	KITUTILITY.CaptureScreenShot(TCN);
} catch (IOException e) {
		
		e.printStackTrace();
	}


}









}
