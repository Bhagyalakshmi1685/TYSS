package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class PrintAllData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file =  new File("Data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("sheet1");
		int row = sh.getLastRowNum();
		for(int i=0; i<=row; i++)
		{
			Row r = sh.getRow(i);
			int c = r.getLastCellNum();
			for(int j=0; j<c; j++)
			{
				Cell cell = r.getCell(j);
				String data = cell.toString();
				System.out.print(data + "\t");
				
			}
			System.out.println( );
			
		}
		
		
	}

}
