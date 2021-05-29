package Star_Patterns;

import java.util.Scanner;

public class NumPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Any input number :  ");
		int num = scan.nextInt();
		int remainder;
		int sum = 0;

		  int temp =num ;    
		  while(num>0)
		  {    
		   remainder = num%10;  
		   sum = (sum*10)+remainder;    
		   num = num/10;    
		  }    
		  System.out.println("Output num :-  "+sum);
		  if(temp==sum)    
		   System.out.println("Given number is a palindrome");    
		  else    
		   System.out.println("number not palindrome");  

	}

}
