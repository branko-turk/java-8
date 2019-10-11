package book2streamoperations.p01filter;

import book2streamoperations.classes.Employee;

public class Example6 {
		
		  public static void main(String[] args) {
			    Employee.persons()
			            .stream()
			            .filter(e -> e.getIncome() > 2500. )
			            .filter(Employee::isMale )
			            .filter(e -> e.getName().startsWith("Ja"))
			            .forEach(System.out::println);
			  }		
}
