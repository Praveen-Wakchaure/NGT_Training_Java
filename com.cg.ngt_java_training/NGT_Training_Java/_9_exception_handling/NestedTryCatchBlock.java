package _9_exception_handling;
import java.util.Scanner;

public class NestedTryCatchBlock {

	public static void main(String[] args) {

		int [] array = {5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Write a divider");
			int number = sc.nextInt();
			System.out.println("Welcome to Program");
			System.out.println("");
			System.out.println("Result: "+array[3]/number);
			System.out.println("");
			
			try
			{
				System.out.println("Write a array index");
				int index = sc.nextInt();
				System.out.println("");
				System.out.println("Number belongs to given index is: "+array[index]);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid Index: "+e);
			}
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Exception occurs due to: "+e);
		}
		
		System.out.println("");
		System.out.println("...........Program Finished............");
	}

}
