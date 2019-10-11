package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionEx {
	  public static void main(String[] args) {
		    IntToDoubleFunction i = (x) -> {return Math.sin(x);};
		    System.out.println(i.applyAsDouble(2));
		  }
}
