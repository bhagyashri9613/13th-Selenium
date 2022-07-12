package KiteAppPOMUsingExcelTestNg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//1
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	@FindBy(xpath="//ul[@class='omnisearch-results']//li")private List<WebElement> multipleOp;
	@FindBy(xpath="//input[@type='text']")private WebElement searchbox;
	//2

	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public void validateUserName(String ExpectedUserId)
  {
		//userName.getText();
	 String actualUserName = userName.getText();
     String expextedUserName=ExpectedUserId;
	
	   if(expextedUserName.equals(actualUserName))
	   {
		   System.out.println("Actual and Expected User Id are matching TC is passed");
         }
	    else
	      {
		   System.out.println("Actual and Expected User Id are not matching TC is failed");
	     }
   }

	//to Gate actual Username
	public String GetacualUsername()
	{
		String actualUserName = userName.getText();
	     return actualUserName;
	
	}
	
	public void logOut() throws InterruptedException
	{
	userName.click();
	Thread.sleep(200);
	logOutButton.click();

	}
	
	public void SendshareNM(String sharenm)
	{
		searchbox.sendKeys(sharenm);
	}
	
	
	public void  getMultioption()
	{
		Iterator<WebElement> IT = multipleOp.iterator();
	while(IT.hasNext())
	  {
		String list = IT.next().getText();
	System.out.println(list);
	  }
	}
	
	
	public  void getactualShare(String string)
	{
	for( WebElement selectone:multipleOp)
	{
		String actual= selectone.getText();
		String expected="TATACOFFEE";
				
	}
	
	
	}
	  
	
	}

	
	

