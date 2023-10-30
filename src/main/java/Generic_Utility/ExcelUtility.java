package Generic_Utility;

import java.io.FileInputStream;



import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This data consits of read data from excelutility..
 * 
 * @author SUBHANI SHAIK...
 */
public class ExcelUtility {
	
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Exception, IOException {
		FileInputStream fis=new FileInputStream(IconstantsUtility.excelFilePath);
		Workbook wbook=WorkbookFactory.create(fis);
String Exceldata=wbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
return Exceldata;
//	Sheet sh=book.getSheet(sheetname);
//	DataFormatter formatter=new DataFormatter();
//	String Exceldata=formatter.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		//return Exceldata;	
	}
	
	/**
	 * 
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @param cellvalue
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void createExcelsheet(String sheetName,int rownum,int cellnum,int cellvalue)throws EncryptedDocumentException, IOException {
		   FileInputStream fis=new FileInputStream(IconstantsUtility.excelFilePath);
           Workbook book=  WorkbookFactory.create(fis);
           book.createSheet(sheetName).createRow(rownum).createCell(cellvalue).setCellValue(cellvalue);
           FileOutputStream fos=new FileOutputStream(IconstantsUtility.excelFilePath);
           book.write(fos);
		   book.close();
		   
	}
	
public Object[][] readMultipleData(String sheetname) throws IOException {
FileInputStream fis=new FileInputStream(IconstantsUtility.excelFilePath);
Workbook wb=  WorkbookFactory.create(fis);
Sheet sh=	wb.getSheet(sheetname);
int lastrow=sh.getLastRowNum();
int lastcell =sh.getRow(0).getLastCellNum();

Object[][] data=new Object[lastrow][lastcell]; 

for(int i=1;i<lastrow;i++)
{
	for(int j=0;j<lastcell;j++)
	{
		data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
}			   
  }		   
return data;	
	}
}
