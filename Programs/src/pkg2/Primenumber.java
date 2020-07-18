package pkg2;

import java.util.Scanner;

public class Primenumber 
{
public static void main(String[] args) 
{
	System.out.println("Enter the value of a :");
	Scanner s= new Scanner(System.in);
	
	int a= s.nextInt();
	
	if (a%1==1)
	{
		System.out.println("Number is prime");
	}
	else
	{
		System.out.println("Number is not prime number");
	}
	
}






}
