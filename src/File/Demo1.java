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

public class Demo1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File("Data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		String data = c.toString();
		System.out.println(data);
		
	}

}
