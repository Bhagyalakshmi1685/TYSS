package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToCountNumOfRows
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file = new File("Data/input.xlsx");
		FileInputStream f =new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("sheet1");
		int r = sh.getLastRowNum();
		System.out.println("num of rows = " + r);
		Row row = sh.getRow(0);
		int cel = row.getLastCellNum();
		System.out.println("nm of cells = " + cel);
	}

}
