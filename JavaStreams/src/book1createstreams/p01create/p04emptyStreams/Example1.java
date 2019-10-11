package book1createstreams.p01create.p04emptyStreams;

import java.util.stream.Stream;

public class Example1 {
	  public static void main(String[] args) {
		  Stream<String> stream  = Stream.empty();
		    stream.forEach(System.out::println);
	  }
}
