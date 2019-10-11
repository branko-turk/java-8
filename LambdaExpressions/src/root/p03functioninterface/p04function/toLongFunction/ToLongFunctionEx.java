package root.p03functioninterface.p04function.toLongFunction;

import java.util.function.ToLongFunction;

public class ToLongFunctionEx {
	public static void main(String[] args) {
		String[] arr = { "1", "2", "3", "4", "1234567890123456"};
		fnc(arr, p -> Long.parseLong(p) + 1L );
	}
	static void fnc( String[] arr, ToLongFunction<String> toLongFunction) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(toLongFunction.applyAsLong(arr[i]));
		}
	}
}
