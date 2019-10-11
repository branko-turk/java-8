package book2streamoperations.p03flatMap;

import java.util.stream.Stream;

public class Example1 {
		  public static void main(String[] args) {
		    Stream.of(10, 20, 30)
		    .flatMap(n -> Stream.of(n, n+2, n+4))
		    .forEach(System.out::println);

		  }
}
