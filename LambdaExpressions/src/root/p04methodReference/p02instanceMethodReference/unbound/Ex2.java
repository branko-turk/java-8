package root.p04methodReference.p02instanceMethodReference.unbound;

import java.util.function.BiFunction;
import root.p04methodReference.classes.Util;

public class Ex2 {
	public static void main(String[] argv) {
		BiFunction<String, String, String> strFunc = Util::append;
		String name = "ana";
		String s = strFunc.apply(name, "matic");
		System.out.println(s);
	}
}
//The following code defines a static method called append in class Util.
//
//The append method accepts two String type parameters and returns a String type result.
//
//Then the append method is used to create a lambda expression and 
//assigned to Java buildin BiFunction functional interface.
//
//The signature of append method matches the signature of the abstract 
//method defined in BiFunction functional interface.