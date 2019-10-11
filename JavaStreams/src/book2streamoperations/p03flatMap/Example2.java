package book2streamoperations.p03flatMap;

import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    Stream.of("XML", "Java",  "CSS")
		        .map(name  ->  name.chars())
		        .flatMap(intStream ->  intStream.mapToObj(n ->  (char)n))
		        .forEach(System.out::println); 

		  }
}
