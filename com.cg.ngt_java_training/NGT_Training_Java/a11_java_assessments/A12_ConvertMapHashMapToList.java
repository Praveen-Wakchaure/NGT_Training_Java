package a11_java_assessments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class A12_ConvertMapHashMapToList {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Character> map = new HashMap<>();
		map.put(0, 'C');
		map.put(1, 'A');
		map.put(2, 'P');
		map.put(3, 'G');
		map.put(4, 'E');
		map.put(5, 'M');
		map.put(6, 'I');
		map.put(7, 'N');
		map.put(8, 'I');
		System.out.println("HashMap is: "+map);
		
		List<Character> charValueList = new ArrayList<>();
		
		for(int i=0; i<map.size(); i++) {
			charValueList.add(map.get(i));
		}
		
		System.out.println("Converted character value list is: "+charValueList);
		
		//List<Character> charValueList1 = new ArrayList<>(map.values());
		//System.out.println("Converted character value list is: "+charKeyList1);
		
		//List<Integer> charKeyList1 = new ArrayList<>(map.keySet());
		//System.out.println("Converted character key list is: "+charKeyList);
	}
		

}
