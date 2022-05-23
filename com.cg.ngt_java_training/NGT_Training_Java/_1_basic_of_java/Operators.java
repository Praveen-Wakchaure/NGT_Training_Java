package _1_basic_of_java;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		
		int a = 3;
		a -= 6;
		System.out.println(a);
		
		int b = 8%4;
		
		int c = 8/4;
		
		System.out.println(b);
		System.out.println(c);
		
		
		// Comparison operator
		
		System.out.println(6<=5); 
		
		// Logical Operator
		
		System.out.println(5<=8 && 6>=2); 
		
		System.out.println((5<=8 && 6>=2) && 5==0); 
		
		System.out.println(5!=7);
		
		//Bitwise operation

		System.out.println(2&3);
		
		/* Bitwise operation
		
		2 -->  1  0
		3 -->  1  1
		--------------
		       1  0 ----> 2
		       
		*/
	}

}
