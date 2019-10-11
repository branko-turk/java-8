package root.p03functioninterface.p01Predicate.longPredicate;

import java.util.function.LongPredicate;

public class p02LongPredicateand {
	public static void main(String[] args) {
		long[] lniz = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArr(lniz, p -> p%2 == 0, p -> p > 4);
	}
	
	static void printArr( long [] arr, LongPredicate  predicate1, LongPredicate  predicate2){
		for (long lng : arr) {
			if(predicate1.and(predicate2).test(lng)) {
				System.out.println(lng);
			}
		}
	}
}
