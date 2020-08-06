package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3
{
	public void Read_Data(int start_row,int end_row) throws BiffException, IOException
	{
		File f= new File("../ExcelHandling/inputfile.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet Sh = wk.getSheet(0);
		for(int j=start_row;j<=end_row;j++)
			{
				for(int i=0;i<5;i++)
					{
						Cell c1 = Sh.getCell(i,j);
						System.out.print(c1.getContents()+" ");
					}	
				System.out.println();
			}
	}

public static void main(String[] args) throws BiffException, IOException
	{
		Assignment3 obj =new Assignment3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row start number =");
		int a = sc.nextInt();
		System.out.println("Enter the Row end number =");
		int b = sc.nextInt();
		obj.Read_Data(a,b);
	}

}
