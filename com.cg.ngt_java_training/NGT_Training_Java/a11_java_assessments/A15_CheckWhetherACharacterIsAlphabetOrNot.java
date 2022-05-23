package a11_java_assessments;

import java.util.Scanner;

public class A15_CheckWhetherACharacterIsAlphabetOrNot {
	
	public static void main (String [] args) {
		
		//ASCII Value a-z == 97-122  && A-Z == 65-90
		
         char a;
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the character: ");
         a = sc.next().charAt(0);
         sc.close();
         
		//Checking ASCII value
		
        if((a>='A' && a<='Z') || (a>='a' && a<='z'))	
            System.out.println("Alphabet");
        else
            System.out.println("Not a Alphabet");
    }
	}
