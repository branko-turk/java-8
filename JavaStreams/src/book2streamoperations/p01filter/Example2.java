package book2streamoperations.p01filter;

import java.util.stream.Stream;

public class Example2 {
	public static void main(String[] args) {
		
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		 Stream.of(nums)
				 .filter( e -> e != 4 && e > 1 )
				 .forEach(System.out::println);
	}
}
