package a11_java_assessments;

import java.util.Scanner;

public class _3_CheckWhetherAStringIsPalindromeOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the string: ");
		
		String str = sc.next();
		sc.close();
		
		str.toLowerCase();
		
		int stringLength = str.length();
		
		String reverse ="";
		
		for (int i = stringLength-1; i>=0; i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(str.equals(reverse))
			System.out.println("string is palindrome");
		else
			System.out.println("String is not palindrome");
	
	}

}
