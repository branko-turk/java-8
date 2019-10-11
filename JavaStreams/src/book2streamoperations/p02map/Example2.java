package book2streamoperations.p02map;

import java.util.stream.IntStream;

public class Example2 {
	  public static void main(String[] args) {
		    IntStream.rangeClosed(1, 5)
		             .map(n -> n * n)
		             .map(n -> n + 1)		             
		             .forEach(System.out::println);
		  }
}
