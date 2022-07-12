package ExcelReed;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 File myfile =new File("C:\\Users\\Asus\\OneDrive\\Documents\\velocity testing\\example.xlsx");	
     Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	 int Totalnorow = mysheet.getLastRowNum();
	int countrow=Totalnorow;
	 System.out.println(Totalnorow);
	 short TotalNoOfCell = mysheet.getRow(Totalnorow).getLastCellNum();
	System.out.println(TotalNoOfCell);
	
	int cellcount=TotalNoOfCell-1;

	for(int i=0;i<=countrow;i++)
{
       for(int j=0;j<=cellcount;j++)
    {
	 Cell cellvalue = mysheet.getRow(i).getCell(j);
	 CellType datatype = cellvalue.getCellType();
	
	 
	 if (datatype==CellType.STRING)
	{
	String value = cellvalue.getStringCellValue();
	System.out.println(value+" ");
	}
	else if(datatype==CellType.NUMERIC)
	{
	double value = cellvalue.getNumericCellValue();
	System.out.println(value+" ");
	}
	else if(datatype==CellType.BOOLEAN)
	{
	boolean value = cellvalue.getBooleanCellValue();
     System.out.println(value+" ");
	}
	
	else if (datatype ==cellvalue.getCellType().BLANK);
	{
		System.out.println("");
	}
	
	
	{
		System.out.println();
	}
	
	
}
		
}
	
 }
}

	

