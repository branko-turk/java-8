package book1createstreams.p01create.p03intStreamfromrange;

import java.util.stream.IntStream;

public class Example1 {
	  public static void main(String[] args) {
		  IntStream oneToFive  = IntStream.range(1, 6);
		    oneToFive.forEach(System.out::println);
		  }
}
