package _2_control_flow_statement;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 //Printing n natural number in reverse order
		 
		 System.out.println("Enter the natural number from where reverse order start");
		 
		 int n = sc.nextInt();
		 
		 for (int i=n; i>0; i--)
		 {
			 System.out.println(i);
		 }
		 
		 //Printing first n odd number
		 
//		 System.out.println("Enter Odd Number to be Printed");
//		 
//		 int n = sc.nextInt();
//		 
//		 for (int i=0 ; i<n ; i++)
//		 {
//		     System.out.println(2*i+1);
//		 }
		 
		 
		 
		 //Infinite loop
		 
		 
//		 for (int a=0 ; a>=0 ; a++ )
//		 {
//			 System.out.println(a);
//		 }
   }

}
