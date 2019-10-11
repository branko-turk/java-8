package book2streamoperations.p04Count;

import java.util.stream.Stream;

public class CountEx {
	public static void main(String[] args) {
	    long num = Stream.of(1, 2, 3, 4, 5)
		        .filter(n -> n % 2 == 1)
		        .count();
		    System.out.println("Count = " + num);		
	}


}
