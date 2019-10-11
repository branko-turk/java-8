package root.p03functioninterface.p03supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import root.p03functioninterface.classes.Person;

public class P01supplier {
    public static void main(String[] args) {
    	 
		List<Person> persons = Arrays.asList(
				new Person("Ana", 26),
				new Person("Ceca", 66),
				new Person("Nena", 63),
				new Person("Bane", 27)
			);
		
		for (Person person : persons) {
			printName( () -> person.getName() );
			printAge( () -> person.getAge() );	
			printAll( () -> person );				
		}
    }
 
	static void printName( Supplier<String>  supplier ){
			System.out.println(supplier.get());
	}
	static void printAge( Supplier<Integer>  supplier ){
		System.out.println(supplier.get());
    }
	static void printAll( Supplier<Person>  supplier ){
		System.out.println(supplier.get());
    }
}
