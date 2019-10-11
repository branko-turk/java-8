package root.p03functioninterface.p05UnaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorapplyAsInt {
	  public static void main(String[] args) {
		    int res = sqr(5, x -> x*x);
		    System.out.println(res);
	  } 
	  static int sqr(int n, IntUnaryOperator intUnaryOperator) {
		   return intUnaryOperator.applyAsInt(n);
	  }
}
