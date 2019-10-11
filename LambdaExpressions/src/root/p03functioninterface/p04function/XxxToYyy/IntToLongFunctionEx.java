package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionEx {
	  public static void main(String[] args) {
		    IntToLongFunction i = x -> (long)x * (long)x ;
		    System.out.println(i.applyAsLong(10000000));
		  }
}
