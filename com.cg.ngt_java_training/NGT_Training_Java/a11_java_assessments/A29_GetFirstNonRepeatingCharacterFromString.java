package a11_java_assessments;

public class A29_GetFirstNonRepeatingCharacterFromString {
	
	public static void main(String[] args) {
		String str = "Get The Future You Want";
		boolean unique = true;
		
		for (int i = 0; i < str.length(); i++) {
		   
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
		         }
		   }
			if (unique) {
		    System.out.println("The first non repeated character in String is: " + str.charAt(i));
		    break;
		   }
		  }
	}
}
