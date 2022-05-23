package _6_strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String sg = "PraVeen";
		
		String s1 = new String ("                        praveen                         ");
		 
		System.out.println(sg);
		System.out.println(s1);
		
		//String Methods
		
		System.out.println(sg.length());
		
		System.out.println(sg.toLowerCase());
		System.out.println(sg.toUpperCase());
		
		System.out.println(sg.substring(3));
		System.out.println(sg.substring(3,6));
		
		System.out.println(sg.replace('e', 'r'));
		System.out.println(sg.replace("e","pp"));
		
		System.out.println(sg.startsWith("Pra"));
		System.out.println(sg.startsWith("N"));
		
		System.out.println(sg.endsWith("en"));
		System.out.println(sg.endsWith("EN"));
		
		System.out.println(sg.charAt(2));
		System.out.println(sg.indexOf('e'));
		
		
		System.out.println(s1);
	    System.out.println(s1.trim());
		
	    //Escape Sequence
	    
	    System.out.println("My name is \"praveen\". \nI am working at \t Capgemini ");

	}

}
