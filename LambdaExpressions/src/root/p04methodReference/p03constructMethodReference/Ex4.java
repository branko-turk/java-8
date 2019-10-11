package root.p04methodReference.p03constructMethodReference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Ex4 {
	  public static void main(String[] argv){
		    IntFunction<int[][]> TwoDimArrayCreator  = int[][]::new;
		    int[][] intArray = TwoDimArrayCreator.apply(5); 
		    // Creates an  int[5][]  array
		    intArray[0] = new int[5]; 
		    intArray[1] = new int[5];
		    intArray[2] = new int[5];
		    intArray[3] = new int[5];
		    intArray[4] = new int[5];
		    
		    System.out.println(Arrays.deepToString(intArray));
		  }
}
