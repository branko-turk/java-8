package root.p03functioninterface.p07binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx1 {
	public static void main(String[] args) {
		String st = add("AAA", "CCC", (p1,p2) -> p1 + " " + p2);
		System.out.println(st);
	}

	static String add(String s1, String s2, BinaryOperator<String>  binaryOperaton){
		return binaryOperaton.apply(s1, s2);
	}
}
//BinaryOperator<T> == BiFunction<T,T,T>