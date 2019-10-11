package book1createstreams.p01create.p01fromValues;

import java.util.stream.Stream;

public class Example1 {
	  public static void main(String[] args) {
		    Stream<String> stream  = Stream.of("java2s.com");
		    stream.forEach(System.out::println);
		  }
}
