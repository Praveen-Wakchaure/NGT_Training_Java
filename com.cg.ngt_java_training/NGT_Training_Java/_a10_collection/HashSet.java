package _a10_collection;

public class HashSet {

	
	public static void main(String[] args) {
		
		java.util.HashSet<Integer> hs = new java.util.HashSet<>(5);
		
		hs.add(501);
		hs.add(502);
		hs.add(503);
		hs.add(504);
		hs.add(505);
		hs.add(506);
		hs.add(507);
		
		hs.add(503);  //Cannot add Duplicate element (Collision)
		
		System.out.print("hs Array: ");
		System.out.println(hs.clone());
		
		hs.clear();
		
		System.out.print("hs Array: ");
		System.out.println(hs.clone());
	}

}
