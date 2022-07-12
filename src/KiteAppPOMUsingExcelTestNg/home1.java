package KiteAppPOMUsingExcelTestNg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home1 {

@FindBy(xpath="//input[@type='text']")private WebElement searchbox;

@FindBy(xpath="//ul[@class='omnisearch-results']//li")private List<WebElement> multipleOp;


public home1(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}

public void SendshareNM(String sharenm)
{
	searchbox.sendKeys(sharenm);
}

public void getMultioption()
{
	Iterator<WebElement> IT = multipleOp.iterator();
while(IT.hasNext())
  {
	System.out.println(IT.next().getText());

  }




}




}