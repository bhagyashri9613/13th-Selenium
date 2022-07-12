package WebDriverMethd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		//1.get---> to enter url in browser or to open an application.
		
		 driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		//2.close-->to close the current tab of the browser opened by Selenium tool.
		
		//driver.close() ;
		
		//3.quit----> to close the all the tabs present in browser opened by Selenium tool.
		 
		// driver.quit();
		
		//4. maximize/ minimize()----->used to maximize/ minimize the browser
		
		driver.manage().window().maximize();
		  driver.manage().window().minimize();
		
		//5. navigate---->this method use to open an application,move forward,backward& refresh the web page.
		
		//driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	   //6.get title:----> this method is use to get title of web page return type of get url method is String
		
		 System.out.println(driver.getTitle());
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//7.get current url-----> this method is use to get url of a web page.return type of get url method is String
	   
		System.out.println(driver.getCurrentUrl());
		
	//String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		//driver.close();
		
		
	}

}
