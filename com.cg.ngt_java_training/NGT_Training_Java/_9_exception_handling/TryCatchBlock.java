package _9_exception_handling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		int a=100;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println("Result is :" +c);
		}
		catch(Exception z)
		{
			System.out.println("Program Failed Due to below reason: ");
			System.out.println("");
			System.out.println(z);
		}
		System.out.println("");
		System.out.println("Program Completed");
	}
	

}
