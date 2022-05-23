package _a10_collection;

public class ArrayList {

	public static void main(String[] args) {
		
		//ArrayList Initialization
		
		java.util.ArrayList <Integer> l1 = new java.util.ArrayList<>();
		
		
		// .add() method
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		System.out.println("Size of Array: "+l1.size());       //.size() method
		System.out.println("Oth index element: "+l1.get(0));   //.get() method
		
		l1.add(0, 11);
		l1.add(0, 12);
		l1.add(0, 13);
		
		l1.set(5, 21);                                         //.set() method
		
		System.out.println("Oth index element: "+l1.get(0));  // It gives last added element in array of 0th index
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		System.out.println("");
		
		java.util.ArrayList<Integer> l2 = new java.util.ArrayList<>();
		
		l2.add(101);
		l2.add(102);
		l2.add(103);
		l2.add(104);
		
		System.out.print("l2 Array: ");
		
		for (int i=0; i<l2.size();i++)
		{	
			System.out.print(l2.get(i));
			System.out.print(" ");
		}
		
		System.out.println("");
		
		//addAll() method
		
		l1.addAll(0,l2);                     //adding array l2 in array l1
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		System.out.println("");
		
		//contains method
		
		System.out.println("l1 contains '13'?: "+l1.contains(13));
		System.out.println("l1 contains '500'?: "+l1.contains(500));
		
		
		//indexOf() method
		
		System.out.println("Index of 13 is: "+l1.indexOf(13));
		
		//empty() method
		
		System.out.println("l1 is empty or not?: "+l1.isEmpty());
		
		//remove() method
		
		//l1.remove(5);           //To remove element of 5th index
		
		//clone() method 
		
		System.out.println("Shallow Copy of l1 Araay: "+l1.clone());
		
		//clear() Method
		
		l1.clear();
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		System.out.println("");
		
		System.out.println("l1 is empty or not?: "+l1.isEmpty());
	
	}

}
