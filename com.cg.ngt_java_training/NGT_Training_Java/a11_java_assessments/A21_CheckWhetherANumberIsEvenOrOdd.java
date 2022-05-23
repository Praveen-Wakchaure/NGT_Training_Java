package a11_java_assessments;

import java.util.Scanner;

public class A21_CheckWhetherANumberIsEvenOrOdd {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		if(number%2==0)
			System.out.println("Even number");
		else if (number%2!=0) {
			System.out.println("Odd number");
		}
	}
}
