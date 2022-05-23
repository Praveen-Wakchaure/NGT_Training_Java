package a11_java_assessments;

import java.util.Scanner;

public class A22_FindTheFrequencyOfCharacterInAString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		String str = sc.next();
		sc.close();
		char c = str.charAt(0);
		
		String str1 = "Get The Future You Want";
		str1 = str1.toLowerCase();
		
		int count =0;
	
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)==c)
				count++;
		}	
		System.out.println("Count of the character "+c+" is: "+count);
	}
}
