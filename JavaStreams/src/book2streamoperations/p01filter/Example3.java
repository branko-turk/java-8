package book2streamoperations.p01filter;

import book2streamoperations.classes.Employee;

public class Example3 {
		
		  public static void main(String[] args) {
			    Employee.persons()
			            .stream()
			            .filter(Employee::isFemale)
			            .forEach(System.out::println);
		 }		
}
