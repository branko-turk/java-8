package root.p04methodReference.p01StaticMethodReference.p2;

import java.util.function.IntBinaryOperator;

public class Ex2 {

	public static void main(String[] args) {
		int res = Integer.sum(5,6);
		System.out.println(res);
		IntBinaryOperator iho1 = (x,y) -> Integer.sum(x, y);
		res = iho1.applyAsInt(16, 7);
		System.out.println(res);		
		IntBinaryOperator iho2 = Integer::sum;
		res = iho2.applyAsInt(16, 14);
		System.out.println(res);	
	}
}


