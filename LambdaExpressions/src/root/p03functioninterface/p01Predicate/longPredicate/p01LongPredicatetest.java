package root.p03functioninterface.p01Predicate.longPredicate;

import java.util.function.LongPredicate;

public class p01LongPredicatetest {
	public static void main(String[] args) {
		long[] lniz = { 1, 2, 3, 4, 5, 6, 7, 8, 99999999999999998L };
		printArr(lniz, p -> p%2 == 0);
	}
	
	static void printArr( long [] arr, LongPredicate  predicate){
		for (long  lng : arr) {
			if(predicate.test(lng)) {
				System.out.println(lng);
			}
		}
	}
}
