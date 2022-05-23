package _2_control_flow_statement;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Natural number ");
		
		int n = sc.nextInt();
		
		int i = 1;
		
		do {
			System.out.println(i);      //Execute atleast one time
			i++;
		}while(i<=n);
	}

}
