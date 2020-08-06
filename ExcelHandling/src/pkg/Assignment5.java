package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5
{
	public void Read_Data(int start_row,int end_row) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f= new File("../ExcelHandling/inputfile.xls");
		File f1= new File("../ExcelHandling/inputfile/text.xls");
		Workbook wk =Workbook.getWorkbook(f);
		WritableWorkbook wk1 =Workbook.createWorkbook(f1);
		WritableSheet Sh1 = wk1.createSheet("Testing",0);
		Sheet Sh = wk.getSheet(0);
		for(int j=start_row;j<=end_row;j++)
			{
				for(int i=0;i<5;i++)
					{
						Cell c1 = Sh.getCell(i,j);
						Label l = new Label(i, j,c1.getContents());
						Sh1.addCell(l);
					}
			}
		wk1.write();
		wk1.close();
		System.out.println("Data saved successfully");
	}
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
		Assignment5 obj =new Assignment5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row start number =");
		int a = sc.nextInt();
		System.out.println("Enter the Row end number =");
		int b = sc.nextInt();
		obj.Read_Data(a,b);
	}

}
