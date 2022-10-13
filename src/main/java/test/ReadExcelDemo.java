package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelDemo {
	public static String[][] data;
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\SOMUKADA\\Desktop\\M3\\Javacodes\\ParameterizationUsingPOI\\datasource\\DataSource.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook wb= new HSSFWorkbook (fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		//data = new String[rowCount+1][cellCount+1];
		for(int i =0;i<= rowCount;i++)
		{
			int cellCount = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<cellCount;j++)
			{
				//data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+",");
			}
		}
		/*for(int k=1;k<data.length;k++)
		{
			for(int l=0;l<2;l++)
			{
				System.out.println(data[k][l]+",");
			}
			System.out.println();
		}
		*/
		
	}

}
