package book2streamoperations.p11sort;

import java.util.Arrays;
import java.util.List;

public class SortEx2 {
		
		public static void main(String[] args) {
			List<Integer> myList =  Arrays.asList( 45, 86, 134, 95, 2, 41, 87, 664);
				myList
				    .stream()
				    .filter(s -> s < 100)
				    .sorted()
				    .forEach(System.out::println);	
		}
}
