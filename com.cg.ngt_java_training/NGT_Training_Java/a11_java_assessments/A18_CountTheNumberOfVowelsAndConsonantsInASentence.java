package a11_java_assessments;

public class A18_CountTheNumberOfVowelsAndConsonantsInASentence {
	
	public static void main(String[] args) {
		
		//ASCII Value a-z == 97-122  && A-Z == 65-90
		
		int vowelsCount =0;
		int consonantCount =0;
		
		String str = "Get The Future You Want";
		str = str.toLowerCase();
	
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				{
				vowelsCount++;
				}
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				{
				consonantCount++;
				}		
		}
		
		System.out.println("Total count of consonant in this sentence is: " +consonantCount);
		System.out.println("Total count of Vowels in this sentence is: " +vowelsCount);
	}
}
