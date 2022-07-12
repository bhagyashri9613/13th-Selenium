package WebElementMethd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(1000);
	
	 WebElement checkbox2 = driver.findElement(By.name("checkBoxOption2"));
	
	 //checkbox2.click();// -------> alternate method
	//boolean boxselect = checkbox2.isSelected();
	//System.out.println( boxselect);
		System.out.println(checkbox2.isSelected());	
			
			if(checkbox2.isSelected())
	{
		System.out.println("checkbx is already selected");
	}
	
	else
	{
	checkbox2.click();
		
		System.out.println("CheckBox is now selected");
	}
	
	
	
	
	
	
	}

}
