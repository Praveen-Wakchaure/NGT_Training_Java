package a11_java_assessments;

import java.util.Scanner;

public class _8_CheckIfAnArrayContainsAGivenValue {
	
	public static void main(String[] args) {
		
		int [] arr = {4, 5, 33, 24, 45, 2, 7, 12};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		sc.close();
		
		boolean match =false;
		
		for(int i=0; i<arr.length; i++) {
			if(input==arr[i])
				match =true;
		}
		
		if(match)
			System.out.println("Array contains given number");
		else 
			System.out.println("Array does not contain given number");
	}
}
