package root.p03functioninterface.p05UnaryOperator.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorcompose {
	  public static void main(String[] args) {
		  int res = sqr(4, x -> x*x, x -> x + 1);
		    System.out.println(res);
		    
		    res = sqr(4, x -> x + 1, x -> x*x);
		    System.out.println(res);
	  } 
	  static int sqr(int n, IntUnaryOperator iuo1, IntUnaryOperator  iuo2) {
		   return iuo1.compose(iuo2).applyAsInt(n);
	  }
}
