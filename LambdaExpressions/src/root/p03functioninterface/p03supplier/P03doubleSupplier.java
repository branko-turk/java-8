package root.p03functioninterface.p03supplier;

import java.util.function.DoubleSupplier;

public class P03doubleSupplier {
    public static void main(String[] args) {
    	 
		for (int i = 0; i < 5 ; i++) {
			printNum( () -> Math.random() ) ;
		}
    }
 
	static void printNum( DoubleSupplier  doubleSupplier ){
			System.out.println(doubleSupplier.getAsDouble());
	}

}
