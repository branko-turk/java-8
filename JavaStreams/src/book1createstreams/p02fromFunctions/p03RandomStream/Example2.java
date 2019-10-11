package book1createstreams.p02fromFunctions.p03RandomStream;

import java.util.Random;
import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    Stream.generate(new Random()::nextInt)
		    .limit(5)
		    .forEach(System.out::println);
		  }
}
//We can use the nextInt() method of the Random class as
//the Supplier in the generate() method to achieve the same.