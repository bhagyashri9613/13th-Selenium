package Scrolling;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInToView {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
       
        WebElement textbox = driver.findElement(By.id("autocomplete"));
	  // scroll down by view web element
       
        JavascriptExecutor jc= (JavascriptExecutor)driver;
	   jc.executeScript("arguments[0].scrollIntoView(true)",textbox );
	   Thread.sleep(500);
	   textbox.sendKeys("shri");

    //
	  // jc.executeScript("window.scrollTo(0,document.body.scrollheight)");
	 //  Thread.sleep(1000);










}

}
