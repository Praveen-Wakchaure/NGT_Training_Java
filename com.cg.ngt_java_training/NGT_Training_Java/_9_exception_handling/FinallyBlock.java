package _9_exception_handling;

public class FinallyBlock {

	public static void main(String[] args) {

     int a =5;
     int b=0;

     try
     {
    	 int c=a/b;
    	 System.out.println(c);
     }
     catch(ArithmeticException e)
     {
    	 System.out.println(e);
     }
     
     finally
     {
    	 System.out.println("");
    	 System.out.println("Program Ends.....................");   // Finally Block executed although the exception occurs or not handled.
     }

	}

}
