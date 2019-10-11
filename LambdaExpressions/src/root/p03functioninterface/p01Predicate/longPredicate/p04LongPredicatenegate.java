package root.p03functioninterface.p01Predicate.longPredicate;

import java.util.function.LongPredicate;

public class p04LongPredicatenegate {
	public static void main(String[] args) {
		long[] lniz = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArr(lniz,  p -> p%3 == 0);
	}
	
	static void printArr( long [] arr, LongPredicate  predicate1){
		for (long lng : arr) {
			if(predicate1.negate().test(lng)) {
				System.out.println(lng);
			}
		}
	}
}
