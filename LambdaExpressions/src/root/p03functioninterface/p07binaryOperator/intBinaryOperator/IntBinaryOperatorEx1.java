package root.p03functioninterface.p07binaryOperator.intBinaryOperator;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorEx1 {
	  public static void main(String[] args) {
		   
		  int res = mul(6, 7, (x,y) -> x*y);
		    System.out.println(res);
		  }
	 static int mul(int i1, int i2, IntBinaryOperator di)  {
		     return di.applyAsInt(i1, i2);
		  } 
}
