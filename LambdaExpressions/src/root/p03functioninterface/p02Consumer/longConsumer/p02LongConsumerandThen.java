package root.p03functioninterface.p02Consumer.longConsumer;

import java.util.function.LongConsumer;

public class p02LongConsumerandThen {
	  public static void main(String[] args) {
		  long[] cniz = { 3, 4, 5};
		  sqr(cniz, d -> System.out.println(d),  d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(long[] arr, LongConsumer lc1, LongConsumer lc2) {
			for (long l : arr) {
				lc1.andThen(lc2).accept(l);
			}
	  }	  
}
