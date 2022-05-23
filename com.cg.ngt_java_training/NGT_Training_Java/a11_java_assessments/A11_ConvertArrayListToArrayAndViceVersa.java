package a11_java_assessments;

import java.util.ArrayList;
import java.util.List;

public class A11_ConvertArrayListToArrayAndViceVersa {
	
	public static void main(String[] args) {
		
		// Convert ArrayList to Array
		ArrayList <Character> charList = new ArrayList<Character>();
		charList.add('C');
		charList.add('A');
		charList.add('P');
		charList.add('G');
		charList.add('E');
		charList.add('M');
		charList.add('I');
		charList.add('N');
		charList.add('I');
		System.out.println("Character list 1 is: "+charList);
		
		Character [] array = new Character [charList.size()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = charList.get(i);
		}
		
		System.out.println("Array is: ");
		
		for(int j=0; j<array.length; j++) {
			System.out.print(array[j]+" ");
		}
		
		System.out.println();
		
		//Convert Array to ArrayList
		
		List <Character> charList2 = new ArrayList<Character>();
		
		for(int k=0; k<array.length; k++) {
			charList2.add(array[k]);
		}	
		System.out.println("Charcter List 2 is: "+charList2);
	}

}
