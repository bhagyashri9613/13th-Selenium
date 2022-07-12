package KiteSeprateClassUsingProprt_Bs_Ut_Test.Listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{

// 1.data members	---declare globally and acess level private
@FindBy(id="userid") private WebElement userName;
@FindBy(id="password")private WebElement password;
@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;

//2. constructor

public KiteLoginPage (WebDriver driver)

{
	PageFactory.initElements( driver,this);
}
//3. methods
public void userSendKey( String UserName)

{
	userName.sendKeys(UserName);
}

public void SendPassword(String Password) 
{
	password.sendKeys(Password);
}

public void clickOnLoginButton()
{
	loginbutton.click();
	
}








}
