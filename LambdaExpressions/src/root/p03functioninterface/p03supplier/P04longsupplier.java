package root.p03functioninterface.p03supplier;

import java.util.function.LongSupplier;

public class P04longsupplier {
    public static void main(String[] args) {
    	 
		for (int i = 0; i < 5 ; i++) {
			printNum( () -> (new Double(Math.random() * 1000000000000L)).longValue() );
		}
    }
 
	static void printNum( LongSupplier  longSupplier ){
			System.out.println(longSupplier.getAsLong());
	}
}
