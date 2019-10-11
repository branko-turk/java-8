package root.p04methodReference.p01StaticMethodReference.p2;

import java.util.function.IntBinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		IntBinaryOperator iho = (x,y) -> x+y;
		int res = iho.applyAsInt(4,7);
		System.out.println(res);
	}

}


