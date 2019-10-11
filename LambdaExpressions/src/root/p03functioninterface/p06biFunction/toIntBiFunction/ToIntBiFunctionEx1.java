package root.p03functioninterface.p06biFunction.toIntBiFunction;

import java.util.function.ToIntBiFunction;
import root.p03functioninterface.classes.Person;

public class ToIntBiFunctionEx1 {
	public static void main(String[] args) {
		Person per1 = new Person("Ana", 21);
		Person per2 = new Person("Aca", 25);
		int df = diff(per1, per2, (p1,p2) -> p1.getAge() -  p2.getAge());
		System.out.println(df);
	}

	static int diff(Person person1, Person person2, ToIntBiFunction<Person, Person>  toIntBiFunction){
		return toIntBiFunction.applyAsInt(person1, person2);
	}
}
//ToIntBiFunction<T, U>  == BiFunction<T, U, Integer>