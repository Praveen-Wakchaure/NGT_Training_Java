package a11_java_assessments;

public class _6_ConcatenateTwoArrays {
	
	public static void main(String[] args) {
		
		int [] a = {2, 4, 6, 8};
		int [] b = {10, 12, 14, 16, 18};
		
		int [] c = new int [a.length + b.length];
		
		int i=0;
		
		for(int l = 0; l<a.length; l++) {	
			c [i] = a [i];
			i++;
		}
		
		for(int j=0; j<b.length; j++) {
			c[i] = b[j];
			i++;
		}
		
		for (int k=0; k<c.length; k++) {
			System.out.print(c[k]+" ");
		}
	}

}
