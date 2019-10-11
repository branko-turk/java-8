package root.p03functioninterface.p04function.doubleFunction;

import java.util.function.DoubleFunction;

public class DoubleFunctionEx {

	public static void main(String[] args) {
		double[] dniz = { 1, 2, 3, 4, 5, 6, Long.MAX_VALUE };
		fnc(dniz, p -> "Num " + p );
	}
	static void fnc(double[] dniz, DoubleFunction <String> doubleFunction ) {
		for (int i = 0; i < dniz.length; i++) {
			System.out.println(doubleFunction.apply(dniz[i]));
		}
	}

}
