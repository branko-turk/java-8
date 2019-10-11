package book2streamoperations.p11sort;

import java.util.List;

import book2streamoperations.classes.Employee;

public class SortEx4 {
		
		public static void main(String[] args) {
			List<Employee> myList =  Employee.persons();
				myList
				    .stream()
				    .sorted( (u,v) -> (int) (u.getIncome() - v.getIncome()) )
				    .forEach(System.out::println);	
		}
}
 