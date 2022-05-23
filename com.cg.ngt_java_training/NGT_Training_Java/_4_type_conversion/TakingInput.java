package _4_type_conversion;

import java.util.Scanner;

public class TakingInput {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Taking input from user");
	
	// Integer Value
	
	System.out.println("Enter the integer number");
	
	int a = sc.nextInt();
	
	
	System.out.println("Enter an another integer number");
	
	int b = sc.nextInt();
	
	int sum = a+b;
	
	System.out.println(sum);
	
	//Float value
	
	System.err.println("Enter the float value");
	
	float c = sc.nextFloat();
	
	System.out.println("Enter an another float value");
	
	float d =sc.nextFloat();
	
	float sum1 = c+d;
	
	System.out.println(sum1);
	
	//String Value
	
	System.out.println("Enter the statement");
	
	String str = sc.nextLine();
	
	System.out.println(str);
	
	//Check enter value is correct or not
	
    System.out.println("Enter the integer value");
	
	boolean e = sc.hasNextInt();
	
	System.out.println(e);
	
	sc.close();
	
	
	
	}

}
