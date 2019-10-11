package book2streamoperations.p05peek;

import java.util.stream.Stream;

public class PeekEx {
	  public static void main(String[] args) {
		    long num = Stream.of(1, 2, 3, 4, 5)
		        .peek(e -> System.out.println("Taking integer: " + e))
		        .filter(n -> n % 2 == 1)
		        .peek(e -> System.out.println("Filtered integer: " + e))
		        .map(n -> n * n).peek(e -> System.out.println("Mapped integer: " + e))
		        .count();
		    System.out.println("Count = "+ num);

		  }
}
//Description
//We can debug a stream by using the peek(Consumer<? super T> action) 
//method of the Stream<T> interface.
//
//The IntStream, LongStream, and DoubleStream also contain a peek() method 
//that takes a IntConsumer, a LongConsumer, and a DoubleConsumer as an argument.
//
//We can use a lambda expression with the peek() method to log elements.