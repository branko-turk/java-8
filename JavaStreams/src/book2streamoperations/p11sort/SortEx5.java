package book2streamoperations.p11sort;

import java.util.List;

import book2streamoperations.classes.Employee;

public class SortEx5 {
		
		public static void main(String[] args) {
			List<Employee> myList =  Employee.persons();
				myList
				    .stream()
				    .sorted( (u,v) -> u.getName().compareTo(v.getName()) )
				    .forEach(System.out::println);	
		}
}
 