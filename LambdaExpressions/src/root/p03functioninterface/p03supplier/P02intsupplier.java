package root.p03functioninterface.p03supplier;

import java.util.function.IntSupplier;

public class P02intsupplier {
    public static void main(String[] args) {
    	 
		for (int i = 0; i < 5 ; i++) {
			printNum( () -> (int)(Math.random() * 10) );
		}
    }
 
	static void printNum( IntSupplier  intsupplier ){
			System.out.println(intsupplier.getAsInt());
	}

}
