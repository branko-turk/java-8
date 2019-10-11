package root.p03functioninterface.p04function.longFunction;

import java.util.function.LongFunction;

public class LongFunctionEx {
	public static void main(String[] args) {
		long[] cniz = { 1, 2, 3, 4, 5, 6, Long.MAX_VALUE };
		fnc(cniz, p -> p/2 );
	}
	static void fnc(long[] cniz, LongFunction<Long> longFunction) {
		for (int i = 0; i < cniz.length; i++) {
			System.out.println(longFunction.apply(cniz[i]));
		}
	}
}
