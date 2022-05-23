package _a10_collection;

public class LinkedList {

	public static void main(String[] args) {


		java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		//l1.add(5, 555);

		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		l1.addLast(100);
		l1.addFirst(100);
		
		l1.add(6, null);           // null can be add in Linked List
		
		System.out.println("");
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		l1.removeLast();
		l1.removeFirst();
		
		System.out.println("");
		
		System.out.println(l1.getFirst());
		
		System.out.println("");
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
	}

}
