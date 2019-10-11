package book1createstreams.p03fromCollections;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    List<String> names = new ArrayList<>();
		    names.add("XML");
		    names.add("Java");

		    Stream<String> sequentialStream  = names.stream();
		    sequentialStream.forEach(System.out::println);

		    Stream<String> parallelStream = names.parallelStream();
		    parallelStream.forEach(System.out::println);
		  }
}
