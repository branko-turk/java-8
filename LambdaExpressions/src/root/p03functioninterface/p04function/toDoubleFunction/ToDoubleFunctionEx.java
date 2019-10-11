package root.p03functioninterface.p04function.toDoubleFunction;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionEx {
	public static void main(String[] args) {
		int[] cniz = { 1, 2, 3, 4, 5 };
		fnc(cniz, p -> (double) p  + 0.5);
	}
	static void fnc(int[] cniz, ToDoubleFunction<Integer> toDoubleFunction ) {
		for (int i = 0; i < cniz.length; i++) {
			System.out.println(toDoubleFunction.applyAsDouble(cniz[i]));
		}
	}
}
