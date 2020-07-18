package pkg2;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		int i,num,result=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to get its factorial");
		
		num=s.nextInt();
		
		for(i=num;i>0;i--)
		{
		    result= result * i;
		}
			System.out.println(num+ "factorial is "+result);
		
		
	}

}
