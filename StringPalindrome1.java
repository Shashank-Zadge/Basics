package Star_Patterns;

import java.util.Scanner;

public class StringPalindrome1
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input String :-   ");
		String s1 = scan.next();
		
		char[] c = s1.toCharArray();
		String s2 = "";
		
		for (int i = c.length-1; i >= 0; i--) 
		{
			s2=s2+c[i];
		}
		System.out.println("Output String :- "+s2);
				
		if(s1.equals(s2))
		{
			System.out.println("Given string is Palindrome ");
		}
		else
		{
			System.out.println("String is not a Palindrome ");
		}
		

		
		
	}

}
