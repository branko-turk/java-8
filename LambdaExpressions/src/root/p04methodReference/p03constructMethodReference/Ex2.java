package root.p04methodReference.p03constructMethodReference;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Ex2 {
	  public static void main(String[] argv){
		    IntFunction<int[]> arrayCreator1 = size ->  new int[size];
		    // Creates an  int array of  five  elements
		    int[] intArray1  = arrayCreator1.apply(5);
		    System.out.println(Arrays.toString(intArray1));

		    IntFunction<int[]> arrayCreator2 = int[]::new;
		    int[] intArray2 = arrayCreator2.apply(5); 
		    System.out.println(Arrays.toString(intArray2));
		  }
}
