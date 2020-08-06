package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4 
{
	public void Read_Data(int column,int row) throws IOException, RowsExceededException, WriteException
	{
		File f= new File("../ExcelHandling/inputfile.xls");
		Scanner s = new Scanner(System.in);
		WritableWorkbook wk =Workbook.createWorkbook(f);
		WritableSheet Sh = wk.createSheet("Testing",0);
		System.out.println("Enter the Data =");
		String data = s.nextLine();
		Label l = new Label(column, row,data);
		Sh.addCell(l);
		wk.write();
		wk.close();
		System.out.println("Data saved successfully");
	}

public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
		Assignment4 obj = new Assignment4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row  number =");
		int a = sc.nextInt();
		System.out.println("Enter the column number =");
		int b = sc.nextInt();
		obj.Read_Data(a,b);
	}

}
