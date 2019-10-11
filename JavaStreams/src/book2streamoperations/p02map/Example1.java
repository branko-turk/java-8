package book2streamoperations.p02map;

import java.util.stream.IntStream;

public class Example1 {
	  public static void main(String[] args) {
		    IntStream.rangeClosed(1, 5)
		             .map(n -> n * n)
		             .forEach(System.out::println);
		  }
}
