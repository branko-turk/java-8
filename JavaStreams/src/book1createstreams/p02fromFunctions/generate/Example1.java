package book1createstreams.p02fromFunctions.generate;

import java.util.stream.Stream;

public class Example1 {
	  public static void main(String[] args) {
		    Stream.generate(Math::random)
		    .limit(5)
		    .forEach(System.out::println);
		  }
}
//generate() method creates a sequential unordered stream.