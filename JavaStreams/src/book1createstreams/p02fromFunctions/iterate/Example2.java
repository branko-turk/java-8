package book1createstreams.p02fromFunctions.iterate;

import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    Stream.iterate(2L, n  ->  n  + 1)
		    .filter(Example2::isOdd)
		    .limit(5)
		    .forEach(System.out::println);
		  }
		  public static boolean isOdd(long number) {
		    if (number % 2 == 0) {
		      return false;
		    }
		    return true;
		  }
}
//The above code filters the values generated from an iterate function..