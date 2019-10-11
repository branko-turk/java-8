package root.p03functioninterface.p01Predicate.intPredicate;

import java.util.function.IntPredicate;

public class p01IntPredicatetest {
	public static void main(String[] args) {
		int[] cniz = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArr(cniz, p -> p%2 == 0);
	}
	
	static void printArr( int [] arr, IntPredicate  predicate){
		for (int integer : arr) {
			if(predicate.test(integer)) {
				System.out.println(integer);
			}
		}
	}
}
