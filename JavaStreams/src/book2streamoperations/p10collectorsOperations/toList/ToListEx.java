package book2streamoperations.p10collectorsOperations.toList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListEx {
	public static void main(String[] args) {
		
		String [] arr = {"Aca", "Ava"};
		
		List<String> lst = Stream.of(arr).collect(Collectors.toList());
		System.out.println(lst);		
	}
}
