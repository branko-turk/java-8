package root.p03functioninterface.p05UnaryOperator.doubleUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorapplyAsDouble {
	  public static void main(String[] args) {
		  double res = sqr(1.5, x -> x*x);
		    System.out.println(res);
	  } 
	  static double sqr(double n, DoubleUnaryOperator doubleUnaryOperator) {
		   return doubleUnaryOperator.applyAsDouble(n);
	  }
}
