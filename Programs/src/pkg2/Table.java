package pkg2;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args)
	{
		int num,i,result;
		Scanner s= new Scanner(System.in);
		System.out.println("Print a table");
		
		num=s.nextInt();
		
		for(i=1;i<=10;i++)
		{
			result= num * i;
			System.out.println(num+"*"+i+"="+result);
		}
		
	}

}
