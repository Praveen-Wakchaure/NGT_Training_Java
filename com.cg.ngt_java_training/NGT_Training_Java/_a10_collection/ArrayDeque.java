package _a10_collection;

public class ArrayDeque {

	public static void main(String[] args) {
		
		//ArrayDeque <Integer> ad = new ArrayDeque<>();
		
		java.util.ArrayDeque<Integer> ad = new java.util.ArrayDeque<>();
		
		ad.add(101);
		ad.add(102);
		ad.add(103);
		ad.add(104);
		
		//ad.add(null);     //<--cannot add null element in ArrayDeque
		
		ad.addFirst(10001);
		ad.addLast(10002);
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		System.out.println(ad.getClass());
		

	}

}
