package a11_java_assessments;

public class _9_FindLargestElementOfAnArray {
	
	public static void main(String[] args) {
		
		int [] arr = {4, 15, 3, 345, 222, 7, 55};
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Maximum value in the array is: "+max);
	}

}
