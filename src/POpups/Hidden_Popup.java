package POpups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

         WebElement search = driver.findElement(By.name("q"));
         search.sendKeys("mobiles");
         driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
