package book1createstreams.p01create.p02streamBuilder;

import java.util.stream.Stream;

public class Example1 {
	  public static void main(String[] args) {
		    Stream<String> stream  = Stream.<String>builder()
		            .add("XML")
		            .add("Java")
		            .add("CSS")
		            .add("SQL")
		            .build();
		        stream.forEach(System.out::println);
		  }
}
