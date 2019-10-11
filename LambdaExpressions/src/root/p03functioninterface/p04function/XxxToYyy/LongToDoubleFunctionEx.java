package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionEx {
	  public static void main(String[] args) {
		    LongToDoubleFunction i = l -> Math.sin(l);
		    System.out.println(i.applyAsDouble(Long.MAX_VALUE));
		  }
}
