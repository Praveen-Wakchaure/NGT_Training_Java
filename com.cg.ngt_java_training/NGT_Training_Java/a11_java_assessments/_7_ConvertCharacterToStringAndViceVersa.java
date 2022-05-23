package a11_java_assessments;

public class _7_ConvertCharacterToStringAndViceVersa {
	
	public static void main(String[] args) {
		
		// Character to string
		
		char c = 'a';
		
		String str = Character.toString(c);
		
		System.out.println("String: "+str);
		
		//String to character
		
		String str1 = "Capgemini";
		
		char [] charArray = new char[str1.length()];
		
		for(int i=0; i<str1.length(); i++) {
			
			charArray[i] = str1.charAt(i);
		}
		
		for (int j =0; j<charArray.length; j++) {
			
			System.out.print(charArray[j]+", ");
		}
		
		//System.out.println(charArray);
	}

}
