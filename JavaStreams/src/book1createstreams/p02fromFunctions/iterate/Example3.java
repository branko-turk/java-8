package book1createstreams.p02fromFunctions.iterate;

import java.util.stream.Stream;

public class Example3 {
	  public static void main(String[] args) {
		    Stream.iterate(1L, n  ->  n  + 1)
		    .filter(Example3::isOdd)
		    .skip(100)
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
//To discard some elements from a stream, use the skip operation.
//
//The skip(long n), an intermediate operation, skips the first n elements of the stream.