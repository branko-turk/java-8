package root.p03functioninterface.p02Consumer.objXXXConsumer;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumeraccept {
	    public static void main(String[] args) {
		  double[] dniz = { 1., 2., 3., 4, Double.MAX_VALUE };
		  
		  printArr(dniz, "number: ", (s,d)->System.out.println(s + d));
		}
		static void printArr( double [] arr, String str,ObjDoubleConsumer<String>  objDoubleConsumer){
			for (double  dbl : arr) {
				objDoubleConsumer.accept(str, dbl);
			}	
		}
}

