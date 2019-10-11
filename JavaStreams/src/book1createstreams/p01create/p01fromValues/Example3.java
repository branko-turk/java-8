package book1createstreams.p01create.p01fromValues;

import java.util.stream.Stream;

public class Example3 {
	  public static void main(String[] args) {
		  String[] names = { "XML", "Java", "SQL", "CSS" };
		    Stream<String> stream = Stream.of(names);
		    stream.forEach(System.out::println);
		  }
}
