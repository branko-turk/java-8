package root.p03functioninterface.p03supplier;

import java.util.function.BooleanSupplier;

public class P05booleansupplier {
    public static void main(String[] args) {
    	 
		for (int i = 0; i < 5 ; i++) {
			printNum( () -> Math.random() > 0.5 );
		}
    }
 
	static void printNum( BooleanSupplier  intsupplier ){
			System.out.println(intsupplier.getAsBoolean());
	}
}
