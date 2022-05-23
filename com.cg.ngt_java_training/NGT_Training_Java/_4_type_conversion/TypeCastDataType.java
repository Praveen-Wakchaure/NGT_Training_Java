package _4_type_conversion;

public class TypeCastDataType {
	
	public static void main(String[] args) {
		
		char grade = 'B';
		
		grade = (char) (grade + 5); // char + int --> int  -----> change to char using type casting
		
		
		System.out.println(grade);
		
		
		//Widening Casting
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    
	    //Narrowing Casting
	    
	    double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble1; // Manual casting: double to int

	    System.out.println(myDouble1);   // Outputs 9.78
	    System.out.println(myInt1);      // Outputs 9
		
		
	}
	
	

}
