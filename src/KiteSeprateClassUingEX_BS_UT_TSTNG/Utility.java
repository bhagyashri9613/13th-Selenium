package KiteSeprateClassUingEX_BS_UT_TSTNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;



public class Utility {
	
public static String ReaddatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException
{
	//excel
	//screenshot
	//closing

	File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
    Sheet mysheet =WorkbookFactory.create(myfile).getSheet("Sheet1");
    String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
    return value;
}

public static void capturescreenShot( WebDriver driver,String TCID) throws IOException
{
	File sorce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Camera Roll\\SS"+TCID+".png");
    FileHandler.copy(sorce, dest);

}











}
