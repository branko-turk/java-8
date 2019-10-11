package root.p04methodReference.p01StaticMethodReference.p1;

import java.util.function.ToIntFunction;
import root.p04methodReference.classes.MyClass1;

public class Ex3 {

	public static void main(String[] args) {
		int i = foo("Jello", MyClass1::myFunc);
		System.out.println(i);
	}
	
	static int foo(String str, ToIntFunction<String> tif) {
		return tif.applyAsInt(str);
	}
}

