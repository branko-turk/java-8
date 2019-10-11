package root.p03functioninterface.p02Consumer.biConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

import root.p03functioninterface.classes.Person;

public class BiConsumeraccept {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
					new Person("Ana", 26),
					new Person("Ceca", 66),
					new Person("Nena", 63),
					new Person("Bane", 27)
				);
		
		printArr(persons, (u, v) ->  {
			  System.out.println(u.getName());
		      System.out.println(v.getAge());
		   } );
	}
	
	static void printArr( List<Person> pers, BiConsumer<Person, Person> biConsumer){
		for (Person person : pers) {
			biConsumer.accept(person, person);
		}
	}
}
