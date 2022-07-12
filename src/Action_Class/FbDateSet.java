package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbDateSet {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Create New Account")).click();
    Thread.sleep(1000);
   //1.   
    WebElement date = driver.findElement(By.id("day"));
    Actions act=new Actions(driver);
     act.click( date).perform();
	for(int i=0;i<=8;i++)
		 {
		   act.sendKeys(Keys.ARROW_DOWN).perform();
			 Thread.sleep(1000);
		 }
			
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	WebElement firstname = driver.findElement(By.name("firstname"));
 //firstname.sendKeys("Bhagyashri");
	Thread.sleep(1000);
	act.keyDown(firstname, Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("hagyashri").build().perform();

	}

}
