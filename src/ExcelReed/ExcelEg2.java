package ExcelReed;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");
		
		Workbook book = WorkbookFactory.create(myfile);
	    Sheet mysheet = book.getSheet("Sheet3");
	    Row myrow = mysheet.getRow(0);
	    Cell mycell = myrow.getCell(0);
		CellType datatype = mycell.getCellType();
		System.out.println("====================================");
		//code for reading whole data from excel sheet
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
			System.out.print( mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			
			}
			System.out.println();
			
			
			
		}
		
		
		
		
	}

}
