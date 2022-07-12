package KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class KITUTILITY extends kitebaseNew {
	
	
	
	
	public  static void  CaptureScreenShot(String TCID) throws IOException
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest = new  File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\newFailedSS"+TCID+".png");
	     FileHandler.copy(source, dest);
	}

	public static String DataFromPropertieFile (String key) throws IOException

	{
		Properties prop =new Properties();
		FileInputStream myfile = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\16May_Selen+13thJun_Apache\\KiteProperties.properties");
		prop.load(myfile);
	    String value = prop.getProperty(key);   
	    return value;

	}
}
