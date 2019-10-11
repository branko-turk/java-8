package root.p03functioninterface.p05UnaryOperator.doubleUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorcompose {
	  public static void main(String[] args) {
		  double res = sqr(0.5, x -> x*x, x -> x + 1);
		    System.out.println(res);
		    
		    res = sqr(0.5, x -> x + 1, x -> x*x);
		    System.out.println(res);
	  } 
	  static double sqr(double n, DoubleUnaryOperator duo1, DoubleUnaryOperator  duo2) {
		   return duo1.compose(duo2).applyAsDouble(n);
	  }
}
