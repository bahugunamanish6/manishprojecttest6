package pkg2;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int i,num,x1=0,x2=1,nextNum;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a fibonacci series");
		num=s.nextInt();
		System.out.println("Fibonacci series is ");
		
		for(i=1;i<=num;i++)
		{
			System.out.println(x1);
		    nextNum= x1+x2;
		    x1=x2;
		    x2=nextNum;
		}
		
	}
	

}
