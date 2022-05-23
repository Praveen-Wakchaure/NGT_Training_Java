package a11_java_assessments;

public class _4_CalculateAverageUsingArrays {
	
	public static void main(String[] args) {
		
		double [] array = {2, 3, 11, 7, 20};
		
		double arraySum = 0;
		double average;
		
		for (int i=0; i<array.length; i++) 	{
			arraySum = arraySum + array[i];
		}
		
		average = arraySum/array.length;	
		System.out.println("Avarage of given array is: "+average);
			
	}

}
