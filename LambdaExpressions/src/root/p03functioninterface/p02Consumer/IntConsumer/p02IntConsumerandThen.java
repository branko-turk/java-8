package root.p03functioninterface.p02Consumer.IntConsumer;

import java.util.function.IntConsumer;

public class p02IntConsumerandThen {
	  public static void main(String[] args) {
		  int[] cniz = { 3, 4, 5};
		  sqr(cniz, d -> System.out.println(d),  d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(int[] arr, IntConsumer ic1, IntConsumer ic2) {
			for (int i : arr) {
				ic1.andThen(ic2).accept(i);
			}
	  }	  
}
