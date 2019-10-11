package book2streamoperations.p07distinct;

import java.util.Arrays;
import java.util.Collection;

public class DistinctEx {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		list
		.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
