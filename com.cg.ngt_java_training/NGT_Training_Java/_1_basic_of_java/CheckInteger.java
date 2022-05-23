package _1_basic_of_java;

import java.util.Scanner;

public class CheckInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer") ;
		
		boolean a =sc.hasNextInt();
		
		System.out.println(a);
		
	}

}
