package KiteAppPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//1
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	

	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public void validateUserName()
  {
		//userName.getText();
	 String actualUserName = userName.getText();
     String expextedUserName="ELR321";
	
	   if(expextedUserName.equals(actualUserName))
	   {
		   System.out.println("Actual and Expected User Id are matching TC is passed");
         }
	    else
	      {
		   System.out.println("Actual and Expected User Id are not matching TC is failed");
	     }
   }

	public void logOut() throws InterruptedException
	{
	userName.click();
	Thread.sleep(200);
	logOutButton.click();

	}
}
