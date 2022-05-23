package a11_java_assessments;

public class A17_DisplayCharactersFromAToZUsingLoop {
	
	public static void main(String[] args) {
		
		//ASCII Value a-z == 97-122  && A-Z == 65-90
		
		char a;
		
		for(int i=65; i<=90; i++) {
			a=(char) i;                
			System.out.print(a+" ");
		}
	}

}
