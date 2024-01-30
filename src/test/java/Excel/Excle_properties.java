package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Excle_properties
{
	static XSSFSheet ram;
	
	public static void Excle() throws IOException 
		{
			FileInputStream fis= new FileInputStream("C:\\Broccoli\\Broccoli\\src\\test\\resources\\inputs.xlsx");
			XSSFWorkbook r=new XSSFWorkbook(fis);
			XSSFSheet ram=r.getSheet("ramaraju");		
			//return ram.getRow(0).getCell(0).getStringCellValue();
			
		}
	public static   String url() 
		{
			
			String w=  ram.getRow(0).getCell(0).getStringCellValue();
			 System.out.println(w);
			return w;
		
		}	
	
	public static void main(String[] args) 
	{
		Excle_properties.url();
	}
		
}
