package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionEX {
	  public static void main(String[] args) {
		    DoubleToIntFunction df = (x) -> (int) (x+0.5);
		    System.out.println(df.applyAsInt(3.49));
		    System.out.println(df.applyAsInt(3.51));	
		  }
}
