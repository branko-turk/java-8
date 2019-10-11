package book2streamoperations.p02map;

import book2streamoperations.classes.Employee;

public class Example4 {
	  public static void main(String[] args) {
		    Employee.persons()
		            .stream()
		            .map(Employee::getName)
		            .map(e -> e.length())
		            .forEach(System.out::println);
		  }
}
