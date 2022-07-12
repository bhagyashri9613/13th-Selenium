package KiteSeprateClassUingEX_BS_UT_TSTNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base {
protected WebDriver driver;
public void openchromebrowser()

{System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");


ChromeOptions opt= new ChromeOptions();
opt.addArguments("disable-notifications");
opt.addArguments("incognito");
driver =new ChromeDriver(opt);
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
}
public void firefoxbrowser()
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\mozila\\geckodriver.exe");
driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


}

}
