package root.p04methodReference.p01StaticMethodReference.p1;

import java.util.function.ToIntFunction;

import root.p04methodReference.classes.MyClass1;

public class Ex2 {

	public static void main(String[] args) {

		ToIntFunction<String> tif = MyClass1::myFunc;
		int i = tif.applyAsInt("Jello");
		System.out.println(i);
	}
}

//s -> MyClass1.myFunc(s) == MyClass1::myFunc
//s -> TypeName.staticMethod(s) == TypeName::staticMethod 
