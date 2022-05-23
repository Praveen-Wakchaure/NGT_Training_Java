package _6_strings;

import java.util.Scanner;

public class PrintType {

	public static void main(String[] args) {
		
		
		int a =3;
		
		float b = 4.55f;
		
		String s ="praveen";
		
		System.out.print(a);
		System.out.println(b);
		System.out.printf("%5d %5f %5s",a,b,s);
		System.out.format("%10d %5f %20s",a,b,s);
		
		//Import string from user
		
		System.out.println("Import string from user");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String sg = sc.next();
		
		System.out.println(sg);

	}

}
