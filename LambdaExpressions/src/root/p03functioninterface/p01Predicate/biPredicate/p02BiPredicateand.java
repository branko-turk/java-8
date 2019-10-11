package root.p03functioninterface.p01Predicate.biPredicate;

import java.util.function.BiPredicate;

public class p02BiPredicateand {
	  public static void main(String[] args) {
		  
		  int[] cniz = {2, 1, 9, 5, 3, 7, 4, 6, 2, 7, 3, 9 };
		  print10(cniz, (x, y) -> x + y == 10, (x, y) -> x < y);
	  }
	  public static void print10(int [] cniz, BiPredicate<Integer, Integer> bi1, BiPredicate<Integer, Integer> bi2) {
		  for (int i = 0; i < cniz.length - 1; i++) {
			  if( bi1.and(bi2).test(cniz[i] , cniz[i+1]) ) {
				  System.out.println(cniz[i] + " " + cniz[i+1]);				  
			  }
		  }
	  }
}
