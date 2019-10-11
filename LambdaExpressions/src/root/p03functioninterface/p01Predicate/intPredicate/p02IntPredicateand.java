package root.p03functioninterface.p01Predicate.intPredicate;

import java.util.function.IntPredicate;

public class p02IntPredicateand {
	public static void main(String[] args) {
		int[] cniz = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArr(cniz, p -> p%2 == 0, p -> p > 4);
	}
	
	static void printArr( int [] arr, IntPredicate  predicate1, IntPredicate  predicate2){
		for (int integer : arr) {
			if(predicate1.and(predicate2).test(integer)) {
				System.out.println(integer);
			}
		}
	}
}
