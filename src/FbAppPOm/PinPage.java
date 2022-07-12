package FbAppPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PinPage {
@FindBy(id="pin") private WebElement PIN;

@FindBy(xpath=" //button[@type='submit']")private WebElement Login;


public  PinPage(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}

public void sendLog()
{
	PIN.sendKeys(" ");
	
}

public void logbtun()

{
	Login.click();
	
}




}
