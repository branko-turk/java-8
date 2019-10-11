package book1createstreams.p02fromFunctions.generate;

import java.util.stream.Stream;

public class Example2 {
	  public static void main(String[] args) {
		    Stream.generate(Example2::next)
		    .limit(5)
		    .forEach(System.out::println);

		  }
		  
		  static int i=0;
		  private static int next(){
		    i++;
		    return i;
		  }
}
//To generate a stream in which the next element is generated 
//based on the previous one, you will need to use a Supplier 
//that stores the last generated element.