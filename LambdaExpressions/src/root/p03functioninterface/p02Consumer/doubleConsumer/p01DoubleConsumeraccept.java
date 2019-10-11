package root.p03functioninterface.p02Consumer.doubleConsumer;

import java.util.function.DoubleConsumer;

public class p01DoubleConsumeraccept {
	  public static void main(String[] args) {
		  double[] dniz = { 1.8, 2.2, 1.3, 1.4, 2.5, 2.6, 2.7, 2.8, 1.9 };
		  sqr(dniz, d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(double[] arr, DoubleConsumer dc) {
			for (double dbl : arr) {
				dc.accept(dbl);
			}
	  }	  
}
