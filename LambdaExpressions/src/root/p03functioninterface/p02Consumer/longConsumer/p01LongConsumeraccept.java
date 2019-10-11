package root.p03functioninterface.p02Consumer.longConsumer;

import java.util.function.LongConsumer;

public class p01LongConsumeraccept {
	  public static void main(String[] args) {
		  long[] lniz = { 1, 2, 3 };
		  sqr(lniz, d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(long[] arr, LongConsumer lc) {
			for (long i : arr) {
				lc.accept(i);
			}
	  }	  
}
