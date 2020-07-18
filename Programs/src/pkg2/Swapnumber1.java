package pkg2;

import java.util.Scanner;

public class Swapnumber1
{

	public static void main(String[] args) 
	{
		int a,b;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		a= s.nextInt();
		
		System.out.println("Enter the value of b :");
		b= s.nextInt();
		
		System.out.println("Before swapping " +a +" " +b);
		
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping " +a +" " +b);
		
	}
}
