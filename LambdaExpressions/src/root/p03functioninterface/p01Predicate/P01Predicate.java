package root.p03functioninterface.p01Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import root.p03functioninterface.classes.Person;

public class P01Predicate {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
					new Person("Ana", 26),
					new Person("Ceca", 66),
					new Person("Nena", 63),
					new Person("Bane", 27)
				);
		
		printArr(persons, p -> p.getAge() > 39);
	}
	
	static void printArr( List<Person> pers, Predicate<Person>  predicate){
		for (Person person : pers) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
	}
}

