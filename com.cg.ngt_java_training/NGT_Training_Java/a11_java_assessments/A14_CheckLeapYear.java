package a11_java_assessments;

import java.util.Scanner;

public class A14_CheckLeapYear {
	
	public static void main (String [] args) {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		sc.close();
		
		if (year%4==0 && year%100!=0)
			System.out.println("Leap year");
		else if (year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not the leap year");
	}

}
