package a11_java_assessments;

public class A30_ProgramsOnPyramid {
	
public static void main(String[] args) {
		
		/*     *
		 *     * *
		 *     * * *
		 *     * * * *
		 * 
		 */
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		// Another Pattern
		
		/*  * * * *
		 *  * * *
		 *  * *
		 *  *
		 * 
		 */
		System.out.println("...............Another Pattern.............");
		System.out.println("");
		
		for(int i=5; i>1; i--) {
			
			for(int j=i; j>1; j--) {
				
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		// Triangular pyramid
		
		System.out.println("...............Another Pattern.............");
		System.out.println("");
		
		int r=5, a = 0;

	    for (int i=1; i<=r; ++i, a=0) { 
	    	
	      for (int j=1; j<=r-i; ++j) {
	        System.out.print("  ");
	      }

	      while (a!=2*i - 1) {
	        System.out.print("* ");
	        ++a;
	      }

	      System.out.println();
	    }
		
	}

}
