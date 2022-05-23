package a11_java_assessments;

import java.util.Arrays;

public class A27_MoveAllZeroToEndOrStartOfArray {

	//Move all 0 to end or start of array (int a[] = {1,0,7,8,6,4,0,0})
	
    public static void move(int[] a)
    {

        int p = 0;

        for (int i: a)
        {
            if (i != 0) {
                a[p] = i;
            }
        }
 
        for (int i = p; i < a.length; i++) {
            a[i] = 0;
        }
    }
 
    public static void main(String[] args)
    {
    	int a[] = {1,0,7,8,6,4,0,0};
 
        move(a);
        System.out.println(Arrays.toString(a));
    }
}
