package FbAppPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPg {

@FindBy(id="email") private WebElement  userEM;
@FindBy(id="pass") private WebElement userID;


 

public LogPg(WebDriver driver)

 {
	 PageFactory.initElements( driver,this);
 }

public void SendEM(String Usernm)
{
	userEM.sendKeys(Usernm);
}

public void SendId(String id)

{
	 userID.sendKeys(id);
}








}
