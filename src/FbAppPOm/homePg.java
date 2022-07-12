package FbAppPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePg {
		
	
	@FindBy(xpath="") private WebElement usenm;
	@FindBy(xpath="") private WebElement logout;
	
	public homePg(WebDriver driver)
	
	{
	    PageFactory.initElements(driver,this);
	}

    public void userclick()
    {
	usenm.click();
     }


    public void logoutclick()
    {
    	logout.click();
    }


}
