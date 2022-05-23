package a11_java_assessments;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class A13_SortAMapByValues {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<>();	
		//G   C    P    A
		//455 43   513  99
		map.put('G', 513);
		map.put('C', 43);
		map.put('P', 455);
		map.put('A', 99);
		System.out.println("map is: "+map);
		
		LinkedList<Entry<Character, Integer>> sortedlist = new LinkedList<>(map.entrySet());
		
		sortedlist.sort(Entry.comparingByValue());
		
		System.out.println("Sorted list by value is: "+sortedlist);
				
		}
	}


