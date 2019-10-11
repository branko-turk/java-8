package root.p03functioninterface.p05UnaryOperator;


import java.util.function.UnaryOperator;

import root.p03functioninterface.classes.Person;

public class UnaryOperatorEx1 {

	public static void main(String[] args) {
		Person per = new Person("Ana", 21);
		Person pAddOne = AddOne(per, p -> p.addOne());
		System.out.println(pAddOne);
	}

	static Person AddOne(Person person, UnaryOperator<Person>  unaryOperator){
		return unaryOperator.apply(person);
	}
}

//UnaryOperator<Person> ==  Function<Person,Person>  