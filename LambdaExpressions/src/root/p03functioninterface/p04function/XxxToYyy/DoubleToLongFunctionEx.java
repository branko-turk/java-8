package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionEx {
	  public static void main(String[] args) {
		    DoubleToLongFunction dl = x -> 10000000000L - (long)x;
		    System.out.println(dl.applyAsLong(1.1));
		  }
}
