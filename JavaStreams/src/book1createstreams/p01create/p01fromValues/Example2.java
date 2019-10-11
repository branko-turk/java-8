package book1createstreams.p01create.p01fromValues;

import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");
		    stream.forEach(System.out::println);
		  }
}
