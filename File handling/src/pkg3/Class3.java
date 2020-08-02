package pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class3 
{
	public void WriteDatainRange(int lineNumber) throws IOException 
	{
		File f = new File("C:\\Users\\Dell\\Desktop\\DummyManish.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String inputData;
		
		for (int i=0;i<lineNumber;i++)
		{
			Scanner sc = new Scanner(System.in);
			inputData=sc.nextLine();
			bw.write(inputData);
			bw.newLine();
		}
		
		bw.close();
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		Class3 obj = new Class3();
		
		System.out.println("Please enter the row number in which you want to enter text");
		Scanner sc1 = new Scanner(System.in);
		int row=sc1.nextInt();
		obj.WriteDatainRange(row);
		
	}

}
