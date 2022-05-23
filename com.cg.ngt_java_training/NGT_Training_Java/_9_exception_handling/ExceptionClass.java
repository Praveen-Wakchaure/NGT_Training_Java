package _9_exception_handling;

import java.util.Scanner;

class MyException extends Exception
{
	@Override
	public String toString() {
		return "Age Not Valid";
	}
	
	@Override
	public String getMessage() {
		
		return "Enter Valid Age";
	}
	
	@Override
	public void printStackTrace() {
		
		
	}
}

public class ExceptionClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		if(age>125 || age<0)
		{
			try
			{
				//throw new MyException();
				throw new ArithmeticException("Age Cannot be negative");
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				//System.out.println(e);               //Prints toString()
				
				System.out.println(".......Exception Tracing.......");
				
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Valid Age");
		}
System.out.println("Program Finished!!!!!!!");
	}

}
