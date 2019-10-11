package root.p03functioninterface.p02Consumer.IntConsumer;

import java.util.function.IntConsumer;

public class p01IntConsumeraccept {
	  public static void main(String[] args) {
		  int[] cniz = { 1, 2, 3 };
		  sqr(cniz, d -> System.out.println(d*d));
	  }
	  
	  public static void sqr(int[] arr, IntConsumer ic) {
			for (int i : arr) {
				ic.accept(i);
			}
	  }	  
}
