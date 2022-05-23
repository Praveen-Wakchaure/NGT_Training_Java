package _1_basic_of_java;

import java.util.Scanner;

public class CheckUserEnterNumberGreaterOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Number");
		 
		 int a = sc.nextInt();
		 
		 System.out.println(a>=5);
	}

}
