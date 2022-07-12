package ExcelReed;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	private static final CellType getSt = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\FBEx.xlsx");	
    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
    int totalRow = mysheet.getLastRowNum();
	short Totalcell = mysheet.getRow(totalRow).getLastCellNum();
	
	int TotalCl = Totalcell-1;
	
	
	
	for(int i=0; i<=totalRow; i++)
	{
		for(int j=0; j<=TotalCl;j++)
		{
			Cell cellv = mysheet.getRow(i).getCell(j);
	        CellType datype = cellv.getCellType();
			
			if(datype==CellType.STRING)
			{
				String value = cellv.getStringCellValue();
			System.out.println( value+" ");
			}
			if(datype==  CellType.NUMERIC)
			
			 {   double numv = cellv.getNumericCellValue();
				System.out.println(numv);
			 }
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
