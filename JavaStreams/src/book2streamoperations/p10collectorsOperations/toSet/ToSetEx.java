package book2streamoperations.p10collectorsOperations.toSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetEx {
	public static void main(String[] args) {
		
		String [] arr = {"Aca", "Ava"};
		
		Set<String> st = Stream.of(arr).collect(Collectors.toSet());
		System.out.println(st);		
	}
}
