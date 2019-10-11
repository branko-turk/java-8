package book1createstreams.p02fromFunctions.p03RandomStream;

import java.util.Random;

public class Example1 {
	  public static void main(String[] args) {
		    new Random().ints()
		    .limit(3)
		    .forEach(System.out::println);
		    
		    new Random().longs()
		    .limit(3)
		    .forEach(System.out::println);		    
		    
		    new Random().doubles()
		    .limit(3)
		    .forEach(System.out::println);	
		  }
}
//java.util.Random class provides ints(), longs(), and doubles() 
//return infinite IntStream, LongStream, and DoubleStream, respectively.