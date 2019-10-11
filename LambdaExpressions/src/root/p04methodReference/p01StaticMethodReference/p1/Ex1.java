package root.p04methodReference.p01StaticMethodReference.p1;

import java.util.function.IntBinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		IntBinaryOperator ibo = (x,y) -> x+y;
		int i = ibo.applyAsInt(4,5);
		System.out.println(i);
	}

}


