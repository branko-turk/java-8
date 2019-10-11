package root.p03functioninterface.p05UnaryOperator.longUnaryOperator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorcompose {
	  public static void main(String[] args) {
		  long res = sqr(4, x -> x*x, x -> x + 1);
		    System.out.println(res);
		    
		    res = sqr(4, x -> x + 1, x -> x*x);
		    System.out.println(res);
	  } 
	  static long sqr(long n, LongUnaryOperator luo1, LongUnaryOperator luo2) {
		   return luo1.compose(luo2).applyAsLong(n);
	  }
}
