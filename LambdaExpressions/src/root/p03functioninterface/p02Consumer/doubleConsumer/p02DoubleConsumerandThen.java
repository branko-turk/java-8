package root.p03functioninterface.p02Consumer.doubleConsumer;

import java.util.function.DoubleConsumer;

public class p02DoubleConsumerandThen {
	  public static void main(String[] args) {
		  double[] dniz = { 1.5, 2.5, 3.5};
		  sqr(dniz, d -> System.out.println(d),  d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(double[] arr, DoubleConsumer dc1, DoubleConsumer dc2) {
			for (double dbl : arr) {
				dc1.andThen(dc2).accept(dbl);
			}
	  }	  
}
