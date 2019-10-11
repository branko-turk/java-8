package root.p03functioninterface.p01Predicate.biPredicate;

import java.util.function.BiPredicate;

public class p01BiPredicatetest {
	  public static void main(String[] args) {
		  
		  int[] cniz = {2, 1, 9, 3, 7, 4, 6, 1, 7, 3, 9 };
		  print10(cniz, (x, y) -> x + y == 10);
	  }
	  public static void print10(int [] cniz, BiPredicate<Integer, Integer> bi) {
		  for (int i = 0; i < cniz.length - 1; i++) {
			  if( bi.test(cniz[i] , cniz[i+1]) ) {
				  System.out.println(cniz[i] + " " + cniz[i+1]);				  
			  }
		  }
	  }
}
