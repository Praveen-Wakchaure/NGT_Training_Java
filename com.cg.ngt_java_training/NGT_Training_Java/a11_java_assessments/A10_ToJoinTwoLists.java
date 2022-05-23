package a11_java_assessments;

import java.util.ArrayList;
import java.util.List;

public class A10_ToJoinTwoLists {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list1 = new ArrayList<>();	
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		System.out.println("List 1 is: "+list1);
		
		ArrayList <Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(12);
		list2.add(14);
		list2.add(16);
		System.out.println("List 2 is: "+list2);
		
		ArrayList <Integer> joinedList = new ArrayList<>();
		joinedList.addAll(list1);
		joinedList.addAll(list2);
		System.out.println("Joined list is: "+joinedList);
	
	}
}
