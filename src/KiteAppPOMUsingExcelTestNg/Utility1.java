package KiteAppPOMUsingExcelTestNg;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility1 {

public String readdataExcel(int row,int cell) throws EncryptedDocumentException, IOException

{
File myfile=new File("");
Sheet myshhet = WorkbookFactory.create(myfile).getSheet("");
String value = myshhet.getRow(row).getCell(cell).getStringCellValue();
return value;
}


}
