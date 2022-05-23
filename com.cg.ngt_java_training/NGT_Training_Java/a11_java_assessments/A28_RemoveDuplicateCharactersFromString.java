package a11_java_assessments;

import java.util.Arrays;

public class A28_RemoveDuplicateCharactersFromString {
	
	static void removeDuplicate(char str[], int length)   
    {     
        int index = 0;   
     
        for (int i = 0; i < length; i++)   
        {    
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    public static void main(String[] args)   
    {   
        String str = "Get The Future You Want ";  
        
        char c[] = str.toCharArray();  
      
        int len = str.length();   
   
        removeDuplicate(c, len);   
    }   
	
//	public static void main(String[] args) {
//		
//		String str = "Get the future you want"; //Get the future you want
//		String str1="";
//		str = str.toLowerCase();
//		
//		for(int i=0; i<str.length(); i++) {
//			
//			for(int j=0; j<i; j++) {
//				
//				if(str.charAt(i)==str.charAt(j))
//				{
//					//no action
//				}
//				else {
//					str1 = str1+str.charAt(i);
//				}
//			}	
//		}		
//		System.out.println(str1);
//	}

}
