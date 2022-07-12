package ExcelReed;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEG1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// create excel sheet and pass the path along with name and extension in File object	
     File myfl =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");
  
      // Using WorkBookFactory class read excel sheet
      // how to read String value

     String name = WorkbookFactory.create(myfl).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
      System.out.println( name);
	 // how to read numeric value
	double numric = WorkbookFactory.create(myfl).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(numric);
	//how to read boolean value
	boolean cond = WorkbookFactory.create(myfl).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
	System.out.println(cond);
	}
}