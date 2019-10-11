package root.p03functioninterface.p06biFunction;

import java.util.function.BiFunction;

import root.p03functioninterface.classes.Person;

public class BiFunctionEx1 {
	public static void main(String[] args) {
		Person per1 = new Person("Ana", 21);
		Person per2 = new Person("Aca", 25);
		int df = diff(per1, per2, (p1,p2) -> p1.getAge() -  p2.getAge());
		System.out.println(df);
	}

	static int diff(Person person1, Person person2, BiFunction<Person, Person, Integer>  bifunction){
		return bifunction.apply(person1, person2);
	}
}
