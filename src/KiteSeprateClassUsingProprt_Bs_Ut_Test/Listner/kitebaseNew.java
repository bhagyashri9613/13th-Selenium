package KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class kitebaseNew {

protected static WebDriver driver;
public void OpenBrowser() throws IOException
{System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("disable-notifications");
    driver= new ChromeDriver(opt);
    driver.manage().window().maximize();
    driver.get(KITUTILITY.DataFromPropertieFile("URL"));
    Reporter.log("launching browser",true);
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	


}


