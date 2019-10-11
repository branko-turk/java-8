package root.p03functioninterface.p07binaryOperator.doubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorEx1 {
	  public static void main(String[] args) {
		   
		    double res = mul(0.23, 0.45, (x,y) -> x*y);
		    System.out.println(res);
		  }
	 static double mul(double d1,double d2, DoubleBinaryOperator di)  {
		     return di.applyAsDouble(d1, d2);
		  } 
}
