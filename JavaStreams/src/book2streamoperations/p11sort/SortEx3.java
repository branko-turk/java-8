package book2streamoperations.p11sort;

import java.util.Arrays;
import java.util.List;

public class SortEx3 {
		
		public static void main(String[] args) {
			List<Double> myList =  Arrays.asList( 4.5, 8.6, 1.34, 9.5, 2.6, 4.1, 8.7, 66.4);
				myList
				    .stream()
				    .filter(s -> s > 5.0 && s < 9.0)
				    .sorted()
				    .forEach(System.out::println);	
		}
}
