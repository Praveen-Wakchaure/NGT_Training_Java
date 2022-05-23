package a11_java_assessments;
import java.util.Scanner;

public class _1_CheckWhetherANumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int a = sc.nextInt();
		sc.close();
		
		int i;
		boolean c =false;
	
		for (i=2; i<a; i++) {
			
			if(a==2) {
				c=false;
				break;
			}
			else if(a%i==0) {
				c =true;
				System.out.println("Divisible by: "+i);
				break;
			}
		}
		
		if(c==true)
			System.out.println("Not a prime number");
		else 
			System.out.println("Prime number");
		}			   
}
