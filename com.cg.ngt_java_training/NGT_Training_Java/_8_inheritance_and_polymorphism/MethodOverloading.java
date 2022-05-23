package _8_inheritance_and_polymorphism;

public class MethodOverloading {
	
	static void praveen()
	{
		System.out.println("Praveen");
	}
	
	static void praveen(int a)                  //<-- Same name different parameters
	{
		System.out.println("Good Morning");
	}
	
	static void praveen(int a, int b)           //<-- Same name different parameters
	{
		System.out.println("Have a nice Day!");	
	}
	
    // Main method (Code Execution Starts from Main Method) 
	
	public static void main(String[] args) {
		
		//Method Overloading
		
		praveen();                               //<-- Same name different parameters
		praveen(1);                              //<-- Same name different parameters
		praveen(1,2);                            //<-- Same name different parameters
		
	}

}
;