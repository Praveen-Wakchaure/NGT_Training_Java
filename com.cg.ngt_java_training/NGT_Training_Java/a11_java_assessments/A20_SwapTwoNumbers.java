package a11_java_assessments;

public class A20_SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=0;
		System.out.println("Value of 'a' before swapping: "+a);
		System.out.println("Value of 'b' before swapping: "+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("Value of 'a' after swapping: "+a);
		System.out.println("Value of 'b' after swapping: "+b);
		
		//Swapping the number without using temporary variable
		
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println("Value of 'a' after swapping without using temporary variable: "+a);
		System.out.println("Value of 'b' after swapping without using temporary variable: "+b);
		
	}

}
