package root.p03functioninterface.p02Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import root.p03functioninterface.classes.Person;

public class P02ConsumerandThen {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
					new Person("Ana", 26),
					new Person("Ceca", 66),
					new Person("Nena", 63),
					new Person("Bane", 27)
				);
		
		printArr(persons,p -> p.setName(p.getName().toUpperCase()), p -> p.setAge(p.getAge() + 1) ,p -> System.out.println(p));
	}
	
	static void printArr( List<Person> pers, 
			              Consumer<Person>  consumer1, 
			              Consumer<Person>  consumer2, 
			              Consumer<Person>  consumer3)
	{
		for (Person person : pers) {
			consumer1.andThen(consumer2).andThen(consumer3).accept(person);
		}
	}
}
