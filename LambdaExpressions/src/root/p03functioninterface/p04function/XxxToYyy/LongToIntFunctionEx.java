package root.p03functioninterface.p04function.XxxToYyy;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionEx {
	  public static void main(String[] args) {
		    LongToIntFunction i = (l) -> (int)l;
		    System.out.println(i.applyAsInt(Long.MAX_VALUE));
		  }
}
