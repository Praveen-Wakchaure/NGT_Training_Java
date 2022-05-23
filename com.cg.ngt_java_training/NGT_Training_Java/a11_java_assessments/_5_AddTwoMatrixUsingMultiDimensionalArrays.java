package a11_java_assessments;

public class _5_AddTwoMatrixUsingMultiDimensionalArrays {
	
	public static void main(String[] args) {
		  
		int a[][]={{1,2},{4,5}}; 
		int b[][]={{7,8},{10,11}};  
		
		// 1  2  +  7   8   =  8  10
		// 4  5     10  11     14  16
		
		int sum[][]= new int[2][2];
		       
		for(int i=0;i<2;i++){
			
			for(int j=0;j<2;j++){
				
				sum[i][j] = a[i][j] + b[i][j]; 
				
				System.out.print(sum[i][j]+"  "); 	
			} 
			
		System.out.println();    
		}    
		}
	}

