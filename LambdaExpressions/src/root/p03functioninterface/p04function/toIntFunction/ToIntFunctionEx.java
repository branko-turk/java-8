package root.p03functioninterface.p04function.toIntFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionEx {
	public static void main(String[] args) {
		String[] arr = { "sima", "ana", "darko", "zorica", "milan"};
		fnc(arr, p -> p.length() );
	}
	static void fnc( String[] arr, ToIntFunction<String> toIntFunction) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(toIntFunction.applyAsInt(arr[i]));
		}
	}
}
