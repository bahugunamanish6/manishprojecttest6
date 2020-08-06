package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 
{
	public void Read_Data(int row) throws BiffException, IOException
	{
		File f= new File("../ExcelHandling/inputfile.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet Sh = wk.getSheet(0);
		for(int i=0;i<=4;i++)
			{
				Cell c1 = Sh.getCell(i,row);
				System.out.print(c1.getContents()+" ");
			}
	}

public static void main(String[] args) throws BiffException, IOException
	{
		Assignment2 obj =new Assignment2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row number =");
		int a = sc.nextInt();	
		obj.Read_Data(a);
	}


}
