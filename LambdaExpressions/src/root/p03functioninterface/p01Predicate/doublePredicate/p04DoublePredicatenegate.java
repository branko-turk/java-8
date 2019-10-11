package root.p03functioninterface.p01Predicate.doublePredicate;

import java.util.function.DoublePredicate;

public class p04DoublePredicatenegate {
	public static void main(String[] args) {
		double[] dniz = { 1.8, 2.2, 1.3, 1.4, 2.5, 2.6, 2.7, 2.8, 1.9 };
		printArr(dniz, p -> p > 1.8);
	}
	
	static void printArr( double [] arr, DoublePredicate  predicate){
		for (double dbl : arr) {
			if(predicate.negate().test(dbl)) {
				System.out.println(dbl);
			}
		}
	}
}
