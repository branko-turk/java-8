package root.p04methodReference.p03constructMethodReference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Ex3 {
	  public static void main(String[] argv){
		    Function<Integer,int[]>  arrayCreator3 = int[]::new;
		    int[] intArray  = arrayCreator3.apply(5); 
		    System.out.println(Arrays.toString(intArray));
		  }
}
