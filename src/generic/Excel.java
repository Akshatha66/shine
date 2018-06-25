package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constants{
	public static String excelsheet(String path,String sheet,int r,int c)
	{
		String s="";
		try
		{
			FileInputStream f=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(f);
			s=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("Data not found");
		}
		return s;
	}

}
