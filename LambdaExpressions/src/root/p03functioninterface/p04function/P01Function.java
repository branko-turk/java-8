package root.p03functioninterface.p04function;

import java.util.function.Function;
import root.p03functioninterface.classes.Person;

public class P01Function {

	public static void main(String[] args) {
		Person per = new Person("Ana", 21);
		Person pAddOne = AddOne(per, p -> p.addOne());
		System.out.println(pAddOne);
	}

	static Person AddOne(Person person, Function<Person,Person>  function){
		return function.apply(person);
	}
}

