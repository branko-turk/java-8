package root.p03functioninterface.p02Consumer.objXXXConsumer;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumeraccept {
	    public static void main(String[] args) {
		  long[] lniz = { 1, 2, 3, 4, 5, 6, 7, 8, Long.MAX_VALUE };
		  
		  printArr(lniz, "number: ", (s,d)->System.out.println(s + d));
		}
		static void printArr( long [] arr, String str,ObjLongConsumer<String>  objLongConsumer){
			for (long  lng : arr) {
				objLongConsumer.accept(str, lng);
			}	
		}
}

