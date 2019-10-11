package book1createstreams.p02fromFunctions.p03RandomStream;

import java.util.Random;
import java.util.stream.IntStream;

public class Example3 {
	  public static void main(String[] args) {
		    IntStream.generate(new Random()::nextInt)
		    .limit(5)
		    .forEach(System.out::println);

		  }
}
//To work with only primitive values, use the generate() method 
//of the primitive type stream interfaces.