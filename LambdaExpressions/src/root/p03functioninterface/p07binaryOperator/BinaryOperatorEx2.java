package root.p03functioninterface.p07binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx2 {
	   public static void main(String[] args) {
		     BinaryOperator<Integer> bi = BinaryOperator.minBy(Comparator.reverseOrder());
		     System.out.println(bi.apply(2, 3));
		   }

	static String add(String s1, String s2, BinaryOperator<String>  binaryOperaton){
		return binaryOperaton.apply(s1, s2);
	}
}
//BinaryOperator<T> == BiFunction<T,T,T>