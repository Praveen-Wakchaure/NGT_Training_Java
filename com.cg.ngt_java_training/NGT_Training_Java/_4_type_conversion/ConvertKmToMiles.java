package _4_type_conversion;

import java.util.Scanner;

public class ConvertKmToMiles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Km Value");
		
		double Km = sc.nextDouble();
		
		double Miles= Km * 0.621371;
		
		System.out.println("Miles=" + Miles);
		
		sc.close();
		
		

		
	}

}
