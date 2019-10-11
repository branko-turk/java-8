package root.p03functioninterface.p04function.intFunction;

import java.util.function.IntFunction;

public class IntFunctionEx {
	public static void main(String[] args) {
		int[] cniz = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fnc(cniz, p -> (double) p + 0.5 );
	}
	static void fnc(int[] cniz, IntFunction<Double> intFunction) {
		for (int i = 0; i < cniz.length; i++) {
			System.out.println(intFunction.apply(cniz[i]));
		}
	}
}
