package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file = new File("Data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("sheet1");
		sh.createRow(8).createCell(1).setCellValue("Aarunya");
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
	}

}
