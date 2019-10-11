package root.p03functioninterface.p05UnaryOperator.longUnaryOperator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorapplyAsLong {
	  public static void main(String[] args) {
		  long res = sqr(5000000, x -> x*x);
		    System.out.println(res);
	  } 
	  static long sqr(long n, LongUnaryOperator longUnaryOperator) {
		   return longUnaryOperator.applyAsLong(n);
	  }
}
