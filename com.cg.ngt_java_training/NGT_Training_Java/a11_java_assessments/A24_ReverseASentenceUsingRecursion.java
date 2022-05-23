package a11_java_assessments;

import java.util.Scanner;

public class A24_ReverseASentenceUsingRecursion {
	
	public static void main(String[] args) {
		
	      String input, result;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the sentence : ");
	      input = sc.nextLine();
	      sc.close();
	      
	      result = reverseString(input);
	      System.out.println("The reversed input is: " +result);
	      
	   }
	   public static String reverseString(String input) {
	      if (input.isEmpty()) {
	        return input;
	      }
	      //System.out.print(input.charAt(0));
	      return reverseString(input.substring(1)) + input.charAt(0);
	   }
}
