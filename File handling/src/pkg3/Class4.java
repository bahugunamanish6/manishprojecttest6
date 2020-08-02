package pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class4 
{
	
public void WriteDataInRange(int firstRow, int lastRow) throws IOException 
{
		
		File f = new File("C:\\Users\\Dell\\Desktop\\DummyManish.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		int rowCount=0;
		String inputData;
		for (int i=0; i<=lastRow; i++) 
		{
			bw.newLine();
			if((rowCount>=firstRow)&&(rowCount<=lastRow))
			{
				Scanner sc = new Scanner(System.in);
				inputData=sc.nextLine();
				bw.write(inputData);
				
			}
			
			rowCount=rowCount+1;
			
			}
		
		bw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Class4 obj = new Class4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first row number");
		int fRow=sc.nextInt();
		System.out.println("Please enter last row number");
		int lRow=sc.nextInt();
		obj.WriteDataInRange(fRow, lRow);
	}

}
