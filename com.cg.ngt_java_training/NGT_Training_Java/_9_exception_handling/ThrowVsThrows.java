package _9_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeRadiusException extends Exception
{

	@Override
	public String toString() {
		
		return "Radius Cannot be Negative";
	}
	
	@Override
	public String getMessage() {
		
		return  "Radius Cannot be Negative";
	}
}

public class ThrowVsThrows {
	
	public static int CircleArea(int r) throws NegativeRadiusException, InputMismatchException {        //throws used as Indicator
		
		if (r<0)
		{
			throw new NegativeRadiusException();                         
		}
		else
		{
			double area=Math.PI*r*r;
			
			System.out.println("Area of circle is: "+area);
		}
		return 0;
	}

	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);

		try 
		{
			System.out.println("Enter the Radius");
			int r=sc.nextInt();
			CircleArea(r);	
		} 
		catch (InputMismatchException i)
		{
			System.out.println("Input Value Must be an Integer Value");
		}
		catch (NegativeRadiusException n) 
		{
			System.out.println(n.getMessage());
		}

	}

}
