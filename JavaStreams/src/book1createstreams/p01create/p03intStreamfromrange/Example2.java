package book1createstreams.p01create.p03intStreamfromrange;

import java.util.stream.IntStream;

public class Example2 {
	  public static void main(String[] args) {
		  IntStream oneToFive  = IntStream.rangeClosed(1, 5);
		    oneToFive.forEach(System.out::println);
		  }
}
