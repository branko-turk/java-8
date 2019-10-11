package root.p03functioninterface.p07binaryOperator.longBinaryOperator;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorEx1 {
	  public static void main(String[] args) {
		   
		  long res = mul(6000000, 7000000, (x,y) -> x*y);
		    System.out.println(res);
		  }
	 static long mul(int i1, int i2, LongBinaryOperator li)  {
		     return li.applyAsLong(i1, i2);
		  } 
}
