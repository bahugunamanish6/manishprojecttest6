package pkg2;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		
	int number = 153;
    int check, rem, sum = 0;
    
    System.out.println("Enter the number to be verified:");
    
    Scanner s= new Scanner(System.in);
    
    number = s.nextInt();
    check = number;
    
    
    while(check != 0) 
    {
       rem = check % 10;
       sum = sum + (rem * rem * rem);
       check = check / 10;
    }
    
    if(sum == number)
    	
       System.out.println("Given number is an armstrong number.");
    
    else
       System.out.println("Given number is not an armstrong number.");
 }

}
