package a11_java_assessments;

import java.util.Scanner;

public class A16_GenerateMultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number: ");
		int a = sc.nextInt();
		sc.close();
		
		System.out.println("Multiplication table for "+a+" is: ");
		
		for (int i=1; i<=10; i++) {
			System.out.println(a+"x"+i+" ="+ a*i);
		}
	}
	

}
