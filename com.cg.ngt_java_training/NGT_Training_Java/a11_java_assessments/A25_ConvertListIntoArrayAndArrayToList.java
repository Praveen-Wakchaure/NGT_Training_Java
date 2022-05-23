package a11_java_assessments;

import java.util.ArrayList;
import java.util.List;

public class A25_ConvertListIntoArrayAndArrayToList {

	public static void main(String[] args) {
		
		//List to Array
		
		List<Character> list = new ArrayList<Character>();
		list.add('C');
		list.add('A');
		list.add('P');
		list.add('G');
		System.out.println("List of the Character is: "+list);
		
		char [] charArray = new char [list.size()];
		
		for(int i=0; i<charArray.length; i++) {
			charArray[i]=list.get(i);
		}
		System.out.print("Converted Character array is: ");
		System.out.println(charArray);
		
		//Array to list
		List<Character> list2 = new ArrayList<Character>();
		
		for(int i=0; i<charArray.length; i++) {
			list2.add(charArray[i]);
		}
		System.out.println("Converted list is: "+list2);

	}

}
