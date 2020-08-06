package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1 
{
	public void Read_Data(int row , int columns) throws BiffException, IOException
	
	{
		File f= new File("../ExcelHandling/inputfile.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet Sh = wk.getSheet(0);
		Cell c1 = Sh.getCell(row,columns);
		System.out.println(c1.getContents());
			
	}

public static void main(String[] args) throws BiffException, IOException
	{
		Assignment1 obj =new Assignment1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row number =");
		int a = sc.nextInt();
		System.out.println("Enter the column number = ");
		int b = sc.nextInt();
	
		obj.Read_Data(a,b);
}

}
