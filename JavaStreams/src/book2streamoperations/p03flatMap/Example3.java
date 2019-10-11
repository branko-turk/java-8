package book2streamoperations.p03flatMap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example3 {
	  public static void main(String[] args) {
		    Stream.of("XML", "Java",  "CSS")
		        .flatMap(
		        		name ->  IntStream.range(0, name.length())
		                .mapToObj(name::charAt)
		        )
		        .forEach(System.out::println);
		  }
}
