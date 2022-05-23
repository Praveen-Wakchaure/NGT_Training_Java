package a11_java_assessments;

public class _2_FibonacciSeries {
	
	public static void main(String[] args) {
		
		// FibonacciSeries: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int a = 0;	
		int b = 1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
			
		for (int i = 0; i<=30 ; i++) {
			
			c = a+b;		
			System.out.println(c);		
			a=b;
			b=c;
		}
	}

}
